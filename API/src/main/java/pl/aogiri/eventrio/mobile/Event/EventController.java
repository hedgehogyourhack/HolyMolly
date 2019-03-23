package pl.aogiri.eventrio.mobile.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/api/events", method = RequestMethod.GET)
    public Iterable<Event> getEvents() {
        return eventRepository.findAll();
    }
    @RequestMapping(value = "/api/events/add", method = RequestMethod.POST)
    public HttpStatus createEvent(@RequestParam String name, @RequestParam double lat, @RequestParam double lng,
                                  @RequestParam Instant dateBeg, @RequestParam Instant dateEnd, @RequestParam String address,
                                  @RequestParam int status, @RequestParam Boolean publi){
        Event event=new Event(name, lat, lng, dateBeg, dateEnd, address, status, publi);
        eventRepository.save(event);
        return HttpStatus.CREATED;
    }

}
