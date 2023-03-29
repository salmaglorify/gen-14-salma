package com.ajax.crud.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {

	@GetMapping("/")
	public String list() {
		return "ajax-crud";
	}
}
