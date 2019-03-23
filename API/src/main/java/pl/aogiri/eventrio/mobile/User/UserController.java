package pl.aogiri.eventrio.mobile.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.aogiri.eventrio.mobile.Event.Event;
import pl.aogiri.eventrio.mobile.Event.EventRepository;
import pl.aogiri.eventrio.mobile.Token.Token;
import pl.aogiri.eventrio.mobile.Token.TokenRepository;

import java.security.*;

import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TokenRepository tokenRepository;

    @CrossOrigin("*")
    @RequestMapping(value = "/api/user/create", method = RequestMethod.POST)
    public Object createUser(@RequestParam String email, @RequestParam String password, @RequestParam String pseudonym,
                                 @RequestParam String gender, @RequestParam Instant birthday) {
        try {
            userRepository.findByEmail(email).get();
            return HttpStatus.CONFLICT;
        } catch (NoSuchElementException x) {
            User user = new User(email, password, pseudonym, gender, birthday, 0);
            userRepository.save(user);
            SecureRandom random = new SecureRandom();
            byte bytes[] = new byte[256];
            random.nextBytes(bytes);
            String toki = bytes.toString();
            Token token = new Token(user.getId(), toki);
            tokenRepository.save(token);
            return token.getToken();
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/user/login", method = RequestMethod.GET)
    public Object login(@RequestParam String email, @RequestParam String password) {
        try {
            User user = userRepository.findByEmailAndPassword(email, password).get();
            return user;
        } catch (NoSuchElementException x) {
            return HttpStatus.CONFLICT;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/join/event", method = RequestMethod.POST)
    public HttpStatus joinEvent(@RequestParam Long id, @RequestParam Long eventId) {
        try {
            Event event = eventRepository.findById(eventId).get();
            List<User> parp = event.getParticipants();
            parp.add(userRepository.findById(id).get());
            eventRepository.save(event);
            return HttpStatus.ACCEPTED;
        } catch (NoSuchElementException x) {
            return HttpStatus.CONFLICT;
        }
    }
}
