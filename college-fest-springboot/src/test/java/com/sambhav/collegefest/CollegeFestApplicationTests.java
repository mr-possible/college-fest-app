package com.sambhav.collegefest;

import com.sambhav.collegefest.dal.models.CollegeStudent;
import com.sambhav.collegefest.dal.models.Event;
import com.sambhav.collegefest.dal.repos.CollegeStudentRepository;
import com.sambhav.collegefest.dal.repos.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CollegeFestApplicationTests {
	
	@Autowired
	private CollegeStudentRepository collegeStudentRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Test
	void testReadStudentByStudentId() {
		Optional<CollegeStudent> collegeStudent = Optional.of(collegeStudentRepository.findById("00010").get());
		System.out.println(collegeStudent);
	}
	
	@Test
	void testReadEventByEventId() {
		Optional<Event> event = Optional.of(eventRepository.findById("fri1600").get());
		System.out.println(event);
	}
	
}
