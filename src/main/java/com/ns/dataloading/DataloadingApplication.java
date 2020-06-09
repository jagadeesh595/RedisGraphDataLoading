package com.ns.dataloading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


@SpringBootApplication
@ComponentScan(basePackages={"com.ns.dataloading"})
public class DataloadingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac =SpringApplication.run(DataloadingApplication.class, args);
		RepositoryCall repocall=ac.getBean(RepositoryCall.class);
		repocall.init();
	}


}
