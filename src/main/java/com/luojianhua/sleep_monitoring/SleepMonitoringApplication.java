package com.luojianhua.sleep_monitoring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luojianhua.sleep_monitoring.repository")
public class SleepMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleepMonitoringApplication.class, args);
	}

}
