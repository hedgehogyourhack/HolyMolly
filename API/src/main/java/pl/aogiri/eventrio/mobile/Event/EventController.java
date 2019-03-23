package pl.aogiri.eventrio.mobile.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @CrossOrigin("*")
    @RequestMapping(value = "/api/events", method = RequestMethod.GET)
    public Iterable<Event> getEvents() {
        return eventRepository.findAll();
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/event",method = RequestMethod.GET)
    public Optional<Event> getEvent(@RequestParam Long id){
        return eventRepository.findById(id);
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/events/box", method = RequestMethod.GET)
    public List<Event> getEventBox(@RequestParam double N, @RequestParam double E,
                                       @RequestParam double S, @RequestParam double W, String date) {
        Iterable<Event> eventy = eventRepository.findAll();
        List<Event> res= new ArrayList<>();
        Instant data= Instant.parse(date);
        eventy.forEach((event) -> {
            double lat = event.getLat();
            double lng = event.getLng();
            Instant date_beg = event.getDateBeg();
            Instant date_end = event.getDateEnd();
            if(date_beg.isBefore(data) && date_end.isBefore(data)) {
                event.setStatus(0);
                eventRepository.save(event);
            }
            if (lat > S && lat < N && lng > W && lng < E && event.getStatus()!=0)
                res.add(event);

        });
        return res;
    }

    @RequestMapping(value = "/api/events/add", method = RequestMethod.POST)
    public HttpStatus createEvent(@RequestParam String name, @RequestParam double lat, @RequestParam double lng,
                                  @RequestParam Instant dateBeg, @RequestParam Instant dateEnd,
                                  @RequestParam String address, @RequestParam int status, @RequestParam Boolean publi) {
        Event event = new Event(name, lat, lng, dateBeg, dateEnd, address, status, publi);
        eventRepository.save(event);
        return HttpStatus.CREATED;
    }

}
