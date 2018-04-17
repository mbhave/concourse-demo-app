package com.example.leftpad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConsumerApplication {

	private static final PaddingService service = new PaddingService();

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class);
	}

	@RestController
	public class PaddingController {

		@RequestMapping("/leftpad/{input}")
		public String addPadding(@PathVariable String input) {
			return ConsumerApplication.service.padWithZeroes(input);
		}

	}
}
