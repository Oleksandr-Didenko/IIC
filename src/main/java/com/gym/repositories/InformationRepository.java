package com.gym.repositories;

import com.gym.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {

    Information findById(int id);
}
