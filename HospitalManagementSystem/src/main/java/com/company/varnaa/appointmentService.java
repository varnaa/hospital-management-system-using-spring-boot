package com.company.varnaa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class appointmentService {
		
		@Autowired
		private appointmentRepository bookAppointment;
		
		
		
		public List<appointment> listAll(){
			return bookAppointment.findAll();
		}
		
		public void save(appointment appointment) {
			bookAppointment.save(appointment);
		}
		
		
		public void delete(Integer id) {
			bookAppointment.deleteById(id);
		}
		
		public int setConfirmation(String confirmation, Integer id) {
			 return bookAppointment.setConfirmation(confirmation, id);
		}
		
		
		public int setPrescription(String confirmation, Integer id) {
			 return bookAppointment.setPrescription(confirmation, id);
		}
		
		public Optional<appointment> get(Integer id) {
			return bookAppointment.findById(id);
			
		}
		
		public List<appointment> findByPatientName(String patientName)
		{
			return bookAppointment.findByPatientName(patientName);
		}
		
		public List<appointment> findByDoctorName(String doctorName)
		{
			return bookAppointment.findByDoctorName(doctorName);
		}
		
		public List<appointment> findByDate(String date, String doctorName){
			return bookAppointment.findByDate(date, doctorName);
		}
		
}

