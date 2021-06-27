package com.vm.movieservice.movie.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroServicesMovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServicesMovieRatingApplication.class, args);
	}

}
