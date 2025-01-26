package com.example.carebridge.repository;

import com.example.carebridge.entity.Hospital;
import com.example.carebridge.entity.HospitalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalInformationRepository extends JpaRepository<HospitalInformation, Integer> {
    List<HospitalInformation> findAllByHospital(Hospital hospital);
    HospitalInformation findByHospitalAndTitle(Hospital hospital, String title);
}
