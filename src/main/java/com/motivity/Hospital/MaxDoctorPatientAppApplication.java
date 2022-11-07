package com.motivity.Hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.motivity.Hospital.controllers"})
public class MaxDoctorPatientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaxDoctorPatientAppApplication.class, args);
	}

}
