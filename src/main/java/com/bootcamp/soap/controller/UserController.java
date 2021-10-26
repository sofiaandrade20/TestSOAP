package com.bootcamp.soap.controller;

import com.bootcamp.soap.model.GetUserRequest;
import com.bootcamp.soap.model.GetUserResponse;
import com.bootcamp.soap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserController {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
