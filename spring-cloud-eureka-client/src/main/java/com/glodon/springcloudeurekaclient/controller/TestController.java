package com.glodon.springcloudeurekaclient.controller;

import com.glodon.framework.base.BaseResponse;
import com.glodon.springcloudeurekaclient.model.UserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${user.name:张三}")
    private String userName;

    @Value("${user.age:12}")
    private Integer age;

    @RequestMapping("")
    public BaseResponse<UserModel> testResponse() {
        BaseResponse<UserModel> baseResponse = new BaseResponse<>();
        baseResponse.setCode(200);
        UserModel userModel = new UserModel();
        userModel.setUserName(userName);
        userModel.setAge(age);
        baseResponse.setData(userModel);
        baseResponse.setMessage("操作成功");
        return baseResponse;
    }
}
