package com.sambhav.collegefest.dal.repos;

import com.sambhav.collegefest.dal.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

}
