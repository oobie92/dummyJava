package com.telus.billpresentment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.telus.billpresentment.config.AppConfig;
import com.telus.billpresentment.config.ApplicationContextProvider;

@SpringBootTest
class DummyApplicationTests {
	
	@Autowired
	ApplicationContextProvider applicationContextProvider;
	
	@DisplayName("Test ApplicationContextProvider")
	@Test
	void contextLoads() {
		assertNotNull(applicationContextProvider);
	}
	
	@DisplayName("Test Environments")
	@Test
	void contextLoadsEnvironments() {
		assertNotNull(applicationContextProvider.getApplicationContext().getBean(AppConfig.class));
		applicationContextProvider.getApplicationContext().getBean(AppConfig.class);

	}
	
	@DisplayName("Test Environment Development database")
	@Test
	void contextLoadsEnvDb() {
		AppConfig env = applicationContextProvider.getApplicationContext().getBean(AppConfig.class);
		assertEquals("development database", env.getDbName());
	}

}
