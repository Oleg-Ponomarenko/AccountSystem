package H2Database.AccountSystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accountsystem")
public class Controller {
    @PostMapping("/users")
    public User createAccount(@RequestBody User user) {
        List<User> u = UsersRepository.findById();

        return UsersRepository.save(new User(user.getUsername(), user.getPassword(), user.getAge()));
    }
}
