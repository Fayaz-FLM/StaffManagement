package com.flm.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.staff.entity.StaffDetails;

public interface StaffDetailsRepository extends JpaRepository<StaffDetails, Integer> {

}
