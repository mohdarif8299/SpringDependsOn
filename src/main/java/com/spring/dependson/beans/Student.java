package com.spring.dependson.beans;
public class Student {
   private Address address;

public Student() {
	super();
	System.out.println("Default Constructor");
}

   //   public Student(Address address) {
//	super();
//	System.out.println("Student Class Parameterized Constructor");
//	this.address = address;
//   }
}
