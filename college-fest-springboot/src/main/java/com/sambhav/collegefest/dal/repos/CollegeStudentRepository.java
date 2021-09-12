package com.sambhav.collegefest.dal.repos;

import com.sambhav.collegefest.dal.models.CollegeStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegeStudentRepository extends JpaRepository<CollegeStudent, String> {
	
}
