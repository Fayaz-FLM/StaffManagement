package com.flm.staff.builder;

import com.flm.staff.dto.StaffAddressDTO;
import com.flm.staff.dto.StaffDetailsDTO;
import com.flm.staff.entity.Staff;
import com.flm.staff.entity.StaffAddress;
import lombok.Builder;

@Builder
public class StaffDTOBuilder {

    public static StaffDetailsDTO fromEntity(Staff staff) {
        if (staff == null) {
            return null;
        }

        return StaffDetailsDTO.builder()
                .staffId(String.valueOf(staff.getStaffId()))
                .firstName(staff.getFirstName())
                .lastName(staff.getLastName())
                .phoneNumber(staff.getPhoneNumber())
                .role(staff.getRole())
                .gender(staff.getGender())
                .dateOfJoining(staff.getDateOfJoining())
                .experienceInYears(staff.getExperienceInYears())
                .email(staff.getStaffDetails() != null ? staff.getStaffDetails().getEmail() : null)
                .specialization(staff.getSpecialization())
                .staffType(staff.getStaffType())
                .isEmployeeActive(staff.isEmployeeActive())
                .canLogin(staff.isCanLogin())
                .staffAddressDto(toAddressDto(staff.getStaffAddress()))
                .build();
    }

    private static StaffAddressDTO toAddressDto(StaffAddress staffAddress) {
        if (staffAddress == null) {
            return null;
        }

        return StaffAddressDTO.builder()
                .landmark(staffAddress.getLandmark())
                .city(staffAddress.getCity())
                .state(staffAddress.getState())
                .country(staffAddress.getCountry())
                .pincode(staffAddress.getPincode())
                .build();
    }
}