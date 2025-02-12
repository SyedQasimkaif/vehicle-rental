package com.rental.repository;

import com.rental.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<Location, String> {
}
