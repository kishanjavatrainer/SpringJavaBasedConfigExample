package com.infotech.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infotech.model.Message;

@Configuration
public class MessageConfig {

	@Bean(name={"message"},autowire=Autowire.BY_NAME)
	public Message getMessage(){
		return new Message();
	}
}
