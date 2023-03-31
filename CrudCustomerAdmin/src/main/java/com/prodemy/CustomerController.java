package com.prodemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@Autowired CustomerService customerService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
//	@RequestMapping("/")
//	public String home(Model m) {
//		List<Customer> customers = service.listAll();
//		m.addAttribute("customers", customers);
//		return "display";
//	} 
//	
//	@RequestMapping("/new")
//	public String newCustomerForm(Map<String, Object> model) {
//	    Customer customer = new Customer();
//	    model.put("customer", customer);
//	    return "new_customer";
//	}
//	
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
//	    service.save(customer);
//	    return "redirect:/";
//	}
//
//	@RequestMapping("/edit")
//	public String editCustomerForm(@RequestParam long id, Model m) {
//	    Customer customer = service.get(id);
//	    m.addAttribute("customer", customer);
//	    return "edit_customer";
//	}
//
//	@RequestMapping("/delete")
//	public String deleteCustomerForm(@RequestParam long id) {
//	    service.delete(id);
//	    return "redirect:/";       
//	}
//	
//	@RequestMapping("/search")
//	public String search(@RequestParam String keyword, Model m) {
//	    List<Customer> result = service.search(keyword);
//	    m.addAttribute("result", result);
//	    return "search";    
//	}
}
