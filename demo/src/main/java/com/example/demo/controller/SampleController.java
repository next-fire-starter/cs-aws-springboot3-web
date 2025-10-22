package com.example.demo.controller;

import java.util.List;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class SampleController {

	@GetMapping
	public String top() {
		return "AAAAAAAAAA";
	}
}