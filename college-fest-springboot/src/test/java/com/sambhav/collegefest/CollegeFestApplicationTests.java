package com.sambhav.collegefest;

import com.sambhav.collegefest.dal.models.CollegeStudent;
import com.sambhav.collegefest.dal.repos.CollegeStudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CollegeFestApplicationTests {
	
	@Autowired
	private CollegeStudentRepository collegeStudentRepository;
	
	@Test
	void testReadStudentByStudentId() {
		Optional<CollegeStudent> collegeStudent = Optional.of(collegeStudentRepository.findById("00010").get());
		System.out.println(collegeStudent);
	}
	
}
