package com.flm.staff.dto;

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
public class StaffAddressDTO {

	private String landmark;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pincode;
	
}
