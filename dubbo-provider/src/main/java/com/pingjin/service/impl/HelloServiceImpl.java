package com.pingjin.service.impl;

import com.pingjin.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHelloName(String name) {
		return "Hello:" + name + "!";
	}

}
