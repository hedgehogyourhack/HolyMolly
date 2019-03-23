package pl.aogiri.eventrio.mobile.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin("*")
    @RequestMapping(value = "/api/user/create", method = RequestMethod.POST)
    public HttpStatus createUser(@RequestParam String email, @RequestParam String password, @RequestParam String pseudonym,
                                 @RequestParam String gender, @RequestParam Instant birthday) {
        try {
            userRepository.findByEmail(email).get();
            return HttpStatus.CONFLICT;
        } catch (NoSuchElementException x){
            User user=new User(email, password, pseudonym, gender, birthday, 0);
            userRepository.save(user);
            return HttpStatus.CREATED;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/user/login", method = RequestMethod.GET)
    public Object login(@RequestParam String email, @RequestParam String password){
        try{
            User user=userRepository.findByEmailAndPassword(email, password).get();
            return user;
        } catch (NoSuchElementException x){
            return HttpStatus.CONFLICT;
        }
    }
}
