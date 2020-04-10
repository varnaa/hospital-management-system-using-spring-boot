package com.company.varnaa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface prescriptionRepository extends JpaRepository<prescription,String> {

	List<prescription> findByPatientName(String patientName);
}
