package com.UST.department.service.repository;

import com.UST.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>
{
    Department findByDepartmentId(Long departmentId);
}