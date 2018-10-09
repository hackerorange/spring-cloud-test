package com.glodon.springcloudfeign.api;

import com.glodon.framework.base.BaseResponse;
import com.glodon.springcloudfeign.model.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER")
public interface ApiClient {

    @RequestMapping("/")
    BaseResponse<UserModel> testResponse();

}
