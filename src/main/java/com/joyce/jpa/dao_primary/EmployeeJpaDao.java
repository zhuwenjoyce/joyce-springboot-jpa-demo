package com.joyce.jpa.dao_primary;

import com.joyce.jpa.domain_primary.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeJpaDao extends JpaRepository<Employee,Integer> {
//    @Query(value = "SELECT * FROM Employee WHERE LASTNAME = ? "
//            , countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?"
//            , nativeQuery = true)
//    Page<Employee> findByLastname(String lastname, Pageable pageable);

    @Query(value = "SELECT u  FROM Employee u WHERE u.username like %:username%")
    List<Employee> findByUsername(@Param("username") String username);
}
