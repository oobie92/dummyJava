package com.telus.billpresentment.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
	
	  private ApplicationContext applicationContext;

	    @Override
	    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	        this.applicationContext = applicationContext;
	    }

	    public ApplicationContext getApplicationContext() {
	        return this.applicationContext;
	    }

}
