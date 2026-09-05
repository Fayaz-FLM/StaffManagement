package com.flm.staff.dto;

import java.time.LocalDate;

import com.flm.staff.constants.Specialization;
import com.flm.staff.constants.StaffType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterStaffDTO {

	private String firstName;
	
	private String lastName;
	
	private long phoneNumber;
	
	private String role;
	
	private String gender;
	
	private LocalDate dateOfJoining;
	
	private int experienceInYears;
	
	private String email;
	
	private StaffAddressDTO staffAddressDTO;
	
	private Specialization specialization;
	
	private StaffType staffType;
}
