package com.prodemy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/companyList")
	public ResponseEntity<List<Customer>> getCompanyList() {
		return new ResponseEntity<List<Customer>>(customerService.listAll(), HttpStatus.OK);
	}

	@PostMapping("/company/{id}")
	public ResponseEntity<Customer> getCompany(@PathVariable Long id) {
		return new ResponseEntity<Customer>(customerService.get(id), HttpStatus.OK);
	}

	@PostMapping("/company/save")
	public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Customer customer) {
		customerService.save(customer);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/company/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
		customerService.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}