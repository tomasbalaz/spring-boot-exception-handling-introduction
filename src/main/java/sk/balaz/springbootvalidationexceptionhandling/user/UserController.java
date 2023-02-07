package sk.balaz.springbootvalidationexceptionhandling.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequestDTO userRequest) {
        return new ResponseEntity<>(
                userService.saveUser(userRequest),
                HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById( @PathVariable("id") Long id) {
        return ResponseEntity.ok().body(userService.getUserById(id));
    }
}
