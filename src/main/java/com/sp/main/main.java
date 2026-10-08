package com.sp.main;
import com.sp.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Student s=(Student) context.getBean("stdId1");
	s.display();
}
}
