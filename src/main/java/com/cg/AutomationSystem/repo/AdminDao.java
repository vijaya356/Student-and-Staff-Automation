package com.cg.AutomationSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AutomationSystem.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String> {
//	@Query("SELECT admin FROM Admin admin WHERE admin.userName=(:uName)")
//    Admin validateAdminLogin(@Param("uName") String userName);

}
