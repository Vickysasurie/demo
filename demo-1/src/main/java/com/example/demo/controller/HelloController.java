package com.example.demo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	  public int hello() {
		int a=50;
		int b=50;
//		Scanner g = new Scanner(System.in);
//		System.out.println("Enter A value: ");
//		a=g.nextInt();
//		b=g.nextInt();
		int sum=a+b;
//		System.out.println("The sum of two numbers are: "+sum);
//		g.close();
		return sum;
//		return "Hello world";
	}
}
