package sk.balaz.springbootvalidationexceptionhandling.user;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
public class UserRequestDTO {

    private String name;

    private String email;

    private String mobile;

    private int age;
}
