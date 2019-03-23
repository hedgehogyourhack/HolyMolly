package pl.aogiri.eventrio.mobile.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    TagRepository tagRepository;

    @CrossOrigin("*")
    @RequestMapping(value = "/api/tags", method = RequestMethod.GET)
    public Iterable<Tag> getTags(){
        return tagRepository.findAll();
    }

}
