package com.flm.staff.builder;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.flm.staff.dto.RegisterStaffDTO;
import com.flm.staff.entity.Staff;
import com.flm.staff.entity.StaffAddress;
import com.flm.staff.entity.StaffDetails;

public class StaffBuilder {
	
	private static final BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	
	public static final ThreadLocal<String> temporaryPassword=new ThreadLocal<String>();
	
	
	
	public static Staff buildStaffFromRegisterStaffDTO(RegisterStaffDTO registerStaffDto) {
		return Staff
		.builder()
		.firstName(registerStaffDto.getFirstName())
		.lastName(registerStaffDto.getLastName())
		.phoneNumber(String.valueOf(registerStaffDto.getPhoneNumber()))
		.staffType(registerStaffDto.getStaffType())
		.role(registerStaffDto.getRole().toUpperCase())
		.gender(registerStaffDto.getGender())
		.specialization(registerStaffDto.getSpecialization())
		.dateOfJoining(registerStaffDto.getDateOfJoining())
		.experienceInYears(registerStaffDto.getExperienceInYears())
		.canLogin(true)
		.isEmployeeActive(true)
		.staffAddress(buildStaffAddress(registerStaffDto))
		.staffDetails(buildStaffDetails(registerStaffDto))
		.build();

	}
	
	public static StaffAddress buildStaffAddress(RegisterStaffDTO registerStaffDto) {
		StaffAddress staffAddress=new StaffAddress();
		BeanUtils.copyProperties(registerStaffDto.getStaffAddressDTO(), staffAddress);
		return staffAddress;
		
		
	}
	
	public static StaffDetails buildStaffDetails(RegisterStaffDTO registerStaffDto) {
		StaffDetails staffDetails=new StaffDetails();
		staffDetails.setEmail(registerStaffDto.getEmail());
		
		Random random=new Random();
		int randomNumber=random.nextInt(1000000);
		
		String tempPassword=String.format("%06d",randomNumber);
		
		temporaryPassword.set(tempPassword);
		
		staffDetails.setPassword(passwordEncoder.encode(tempPassword));
		
		staffDetails.setRequirePasswordReset(true);
		return staffDetails;
		
		
	}
	
	public static Staff updateStaffFromRegisterStaffDTO(RegisterStaffDTO registerStaffDto,Staff staff) {
		staff.setFirstName(registerStaffDto.getFirstName());
		staff.setLastName(registerStaffDto.getLastName());
		staff.setPhoneNumber(String.valueOf(registerStaffDto.getPhoneNumber()));
		staff.setStaffType(registerStaffDto.getStaffType());
		staff.setRole(registerStaffDto.getRole().toUpperCase());
		staff.setGender(registerStaffDto.getGender());
		staff.setSpecialization(registerStaffDto.getSpecialization());
		staff.setDateOfJoining(registerStaffDto.getDateOfJoining());
		staff.setExperienceInYears(registerStaffDto.getExperienceInYears());
		
		BeanUtils.copyProperties(registerStaffDto.getStaffAddressDTO(),staff.getStaffAddress());
		
		staff.getStaffDetails().setEmail(registerStaffDto.getEmail());
		return staff;
	}

}
