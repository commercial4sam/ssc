package com.aks.healthservice.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

	
	@Before("execution(* com.aks.healthservice.controllers.MemberRegistrationController.*(..))")
	public void beforeLogging(JoinPoint point){
		
		System.out.println("AOP Log every Method --->"+point.getSignature().getName());
	}
	
	
	
	
}
