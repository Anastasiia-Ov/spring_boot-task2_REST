package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.Authorities;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, Map<String, Authorities>> users = Map.of(
            "ivan123", Map.of("ivanito", Authorities.READ),
            "viktor45", Map.of("vitiao", Authorities.READ),
            "it08123", Map.of("345it", Authorities.WRITE),
            "mark645", Map.of("markero23", Authorities.WRITE),
            "sonia88", Map.of("parus24", Authorities.DELETE),
            "dima765", Map.of("team55", Authorities.DELETE)
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (users.containsKey(user) && users.get(user).containsKey(password)) {
            return List.of(users.get(user).get(password));
        }
        return null;
    }
}