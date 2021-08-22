package com.example.demo;

import com.example.demo.billionaire.Billionaire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Billionaire> hello() {
		return List.of(
				new Billionaire(
						1L,
						"Jeff Bezos",
						177.0F,
						57,
						"United States"

				)
		);
	}

}
