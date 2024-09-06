package org.example.java2024.repository;

import org.example.java2024.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from users as u \n" +
            "inner join girl_friends as gf \n" +
            "on u.id = gf.user_id", nativeQuery = true)
    List<Object[]> custom();


    Optional<User> findByUserName(String username);
}
