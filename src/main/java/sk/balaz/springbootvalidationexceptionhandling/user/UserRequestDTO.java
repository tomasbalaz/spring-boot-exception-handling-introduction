package sk.balaz.springbootvalidationexceptionhandling.user;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank
    @NotNull
    private String name;

    @Email
    private String email;

    @NotBlank
    @NotNull
    private String mobile;

    @Min(value = 1, message = "Invalid Age: Equals to zero or Less than zero")
    @Max(value = 100, message = "Invalid Age: Exceeds 100 years")
    private int age;
}
