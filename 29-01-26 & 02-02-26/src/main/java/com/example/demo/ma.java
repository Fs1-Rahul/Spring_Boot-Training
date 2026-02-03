package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ma {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      hw obj = (hw) context.getBean("hw");
      obj.getMessage();
      context.registerShutdownHook();
      hw obj1 =(hw) context.getBean("cal");
      obj1.getMessage();
      
   }
}