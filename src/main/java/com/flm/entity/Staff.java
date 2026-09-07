package com.flm.entity;

import java.time.LocalDate;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="staff")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	@Enumerated(EnumType.STRING)
	private  StaffType staffType;
	
	private String role;
	
	private String gender;
	
	@Enumerated(EnumType.STRING)
	private StaffSpecialization specialization;
	
	private LocalDate dateOfJoining;
	
	private int experienceInYears;
	
	private boolean canLogin;
	
	private boolean isEmployeeActive;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="staff_details_id")
	private StaffDetails staffDetails;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="staff_address_id")
	private StaffAddress staffAddress;
	
}
