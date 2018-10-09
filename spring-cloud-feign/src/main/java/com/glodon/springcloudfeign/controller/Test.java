package com.glodon.springcloudfeign.controller;

import com.glodon.framework.base.BaseResponse;
import com.glodon.springcloudfeign.api.ApiClient;
import com.glodon.springcloudfeign.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private ApiClient apiClient;


    @RequestMapping("")
    public BaseResponse<UserModel> test() {
        return apiClient.testResponse();
    }


}
