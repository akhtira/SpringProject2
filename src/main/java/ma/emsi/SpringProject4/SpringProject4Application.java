package ma.emsi.SpringProject4;

import ma.emsi.SpringProject4.dao.UserRepository;
import ma.emsi.SpringProject4.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProject4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject4Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			userRepository.save(new User(null, "User1", "Pass1", "Ali", "Alami"));
			userRepository.save(new User(null, "User2", "Pass2", "Meryem", "Fatimi"));

		};
	}

}
