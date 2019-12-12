package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/api")
    @ResponseBody
    public String getFoos(@RequestParam String language) {
    	
    	
    	switch (language) {
    	    case "Danish":
    	    	return "The rooster" +" "+language+" " + "sound : kykyliky";
    	    case "Dutch":
    	    	return "The rooster" +" "+language+" " + "sound : kukeleku";
    	    default:
    	       return "Don't have rooster sound.";
    	}
    
    }
}
