package com.rental.repository;
import com.rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@SuppressWarnings("unused")
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);  // Custom query for login validation
}
