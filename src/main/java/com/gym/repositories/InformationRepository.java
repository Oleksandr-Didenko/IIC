package com.gym.repositories;

import com.gym.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {

    Optional<Information> findById(int id);

}
