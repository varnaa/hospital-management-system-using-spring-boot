package com.company.varnaa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class invoiceservice {

	@Autowired
	private invoiceRepository rep;
	
	
	public void save(invoice entity) {
		rep.save(entity);
	}
	
	public List<invoice> view(){
		return rep.findAll();
	}
}
