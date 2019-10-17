package com.spring.dependson.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public Address() {
		System.out.println("Address default constructor");
	}
}
