package sk.balaz.springbootvalidationexceptionhandling.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sk.balaz.springbootvalidationexceptionhandling.exception.UserNotFoundException;

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

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(String.format("User %d not found ", id)));

    }
}
