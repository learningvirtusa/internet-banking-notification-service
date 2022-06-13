package com.core.banking.notification.service.internetbankingnotificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InternetBankingNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingNotificationServiceApplication.class, args);
	}

}
