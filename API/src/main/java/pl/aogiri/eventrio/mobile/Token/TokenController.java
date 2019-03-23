package pl.aogiri.eventrio.mobile.Token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.aogiri.eventrio.mobile.User.User;
import pl.aogiri.eventrio.mobile.User.UserRepository;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class TokenController {

    @Autowired
    TokenRepository tokenRepository;

    @Autowired
    UserRepository userRepository;

    @CrossOrigin("*")
    @RequestMapping(value = "/login/token", method = RequestMethod.GET)
    public Object loginByToken(@RequestParam String token){
        try{
            Token tok= tokenRepository.findByToken(token).get();
            User user= userRepository.findById(tok.getUserId()).get();
            return user;
        } catch (NoSuchElementException x){
            return HttpStatus.CONFLICT;
        }
    }
}
