package com.bitemiisoftware.services.hellobitemii.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
@Controller
public class Hellocontroller {
@RequestMapping("/")
@ResponseBody()
String home()
{
	return "Hello World!!!";
}
}
