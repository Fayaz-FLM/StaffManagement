package com.flm.staff.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.staff.entity.DoctorSchedule;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Integer> {

}
