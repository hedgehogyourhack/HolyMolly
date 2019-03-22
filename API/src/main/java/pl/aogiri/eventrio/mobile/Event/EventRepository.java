package pl.aogiri.eventrio.mobile.Event;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Long> {
}
