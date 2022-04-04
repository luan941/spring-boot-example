package vn.example;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@GetMapping("/hello")
	public Message hello() {
		return Message.builder()
				.message("Hello World from Vinh and Luan!")
				.code(200)
				.build();
	}

	@Data
	@Builder
	public static class Message {
		private String message;
		private int code;
	}
}
