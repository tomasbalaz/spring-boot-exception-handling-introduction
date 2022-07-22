package sk.balaz.springbootvalidationexceptionhandling.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(UserRequestDTO userRequestDTO) {
        User user = User.builder()
                .name(userRequestDTO.getName())
                .email(userRequestDTO.getEmail())
                .mobile(userRequestDTO.getMobile())
                .age(userRequestDTO.getAge())
                .build();

        return userRepository.save(user);
    }
}
