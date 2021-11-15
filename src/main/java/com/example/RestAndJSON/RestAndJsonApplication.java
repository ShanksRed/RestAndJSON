package com.example.RestAndJSON;

import com.example.RestAndJSON.Entity.User;
import com.example.RestAndJSON.Service.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.List;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class RestAndJsonApplication implements CommandLineRunner {

	@Autowired
	userServiceImpl userService;

	public static void main(String[] args) {
		SpringApplication.run(RestAndJsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = userService.findByName("Slava");
		for(User u :users){
			System.out.print(u);
			System.out.printf("%n");

		}
	}


}
