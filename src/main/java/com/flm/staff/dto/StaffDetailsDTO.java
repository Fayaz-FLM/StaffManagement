package com.flm.staff.dto;

import java.time.LocalDate;

import com.flm.staff.constants.Specialization;
import com.flm.staff.constants.StaffType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffDetailsDTO {

	private String staffId;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String role;
	
	private String gender;
	
	private LocalDate dateOfJoining;
	
	private int experienceInYears;
	
	private String email;
	
	private Specialization specialization;
	
	private StaffType staffType;
	
	private boolean isEmployeeActive;
	
	private boolean canLogin;
	
	private StaffAddressDTO staffAddressDto;
}
