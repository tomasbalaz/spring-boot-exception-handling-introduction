package sk.balaz.springbootvalidationexceptionhandling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sk.balaz.springbootvalidationexceptionhandling.user.UserRequestDTO;
import sk.balaz.springbootvalidationexceptionhandling.user.UserService;

@SpringBootApplication
public class SpringBootValidationExceptionHandlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootValidationExceptionHandlingApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            userService.saveUser(
                    UserRequestDTO.builder()
                            .name("John")
                            .email("john@gmail.com")
                            .mobile("1234567890")
                            .age(50)
                    .build()
            );

            userService.saveUser(
                    UserRequestDTO.builder()
                            .name("Tom")
                            .email("tom@gmail.com")
                            .mobile("1234567890")
                            .age(30)
                            .build()
            );

        };
    }
}
