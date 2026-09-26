package com.flm.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flm.staff.entity.StaffDetails;

@Repository
public interface StaffDetailsRepository extends JpaRepository<StaffDetails, Integer> {

}
