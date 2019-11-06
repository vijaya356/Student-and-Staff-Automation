package com.cg.AutomationSystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.AutomationSystem.entity.Course;


@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{
	
	@Modifying
	@Transactional
	@Query("update Course course set course.registered = :registered where course.id = :id")
	void updateReg(@Param("registered") Boolean registered, @Param("id") Integer id);
	
//	@Query("select  Course course where course.id = :id")
//	List<Course> getCourses(@Param("id") int id);

}
