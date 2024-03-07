package com.onesoft.mydevapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/line")
public String get() {
	return "வெற்றி";
}
}
