package cl.favorit.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPersonaApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return null;
	}
	
}
