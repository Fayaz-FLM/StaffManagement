package com.flm.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flm.staff.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
