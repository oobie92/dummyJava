package com.telus.billpresentment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.telus.billpresentment.config.AppConfig;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DummyService implements CommandLineRunner {
	
	public static AppConfig appConfig;
	
	@Autowired
	public void setAppConfig(AppConfig appConfig) {
		DummyService.appConfig = appConfig;
	}	
	

	@Override
	public void run(String... args) throws Exception {
		log.info("Database name: " + appConfig.getDbName());
		appConfig.getQueries().forEach(log::info);
	}

}
