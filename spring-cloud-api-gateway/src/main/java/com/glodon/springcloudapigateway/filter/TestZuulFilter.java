package com.glodon.springcloudapigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class TestZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String authorization = currentContext.getRequest().getParameter("Authorization");
        if (!"1".equalsIgnoreCase(authorization)) {
            HttpServletResponse response = currentContext.getResponse();

            try (ServletOutputStream outputStream = response.getOutputStream();) {
                response.setContentType("application/json");
                response.addHeader("charset", "UTF-8");
                outputStream.write(("" +
                        "{\n" +
                        "    \"code\": \"-100\",\n" +
                        "    \"message\": \"鉴权失败\"\n" +
                        "}").getBytes(StandardCharsets.UTF_8));
                currentContext.setSendZuulResponse(false);
                return false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
