package pl.aogiri.eventrio.mobile.Token;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TokenRepository extends CrudRepository<Token, Long> {
    Optional<Token> findByToken(String token);
}
