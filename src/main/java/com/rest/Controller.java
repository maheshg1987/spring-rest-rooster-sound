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
    	    case "Finnish":
    	    	return "The rooster" +" "+language+" " + "sound : kukko kiekuu";
    	    case "French":
    	    	return "The rooster" +" "+language+" " + "sound : cocorico";
    	    case "German":
    	    	return "The rooster" +" "+language+" " + "sound : kikeriki";
    	    case "Greek":
    	    	return "The rooster" +" "+language+" " + "sound : kikiriki";
    	    case "Hebrew":
    	    	return "The rooster" +" "+language+" " + "sound : coo-koo-ri-koo";
    	    case "Hungarian":
    	    	return "The rooster" +" "+language+" " + "sound : kukuriku";
    	    case "Italian":
    	    	return "The rooster" +" "+language+" " + "sound : chicchirichi";
    	    case "Japanese":
    	    	return "The rooster" +" "+language+" " + "sound : ko-ke-kok-ko-o";
    	    case "Portuguese":
    	    	return "The rooster" +" "+language+" " + "sound : cucurucu";
    	    case "Russian":
    	    	return "The rooster" +" "+language+" " + "sound : kukareku";
    	    case "Swedish":
    	    	return "The rooster" +" "+language+" " + "sound : kuckeliku";
    	    case "Turkish":
    	    	return "The rooster" +" "+language+" " + "sound : kuk-kurri-kuuu";
    	    case "Urdu":
    	    	return "The rooster" +" "+language+" " + "sound : kuklooku";
    	    default:
    	       return "Don't have rooster sound.";
    	}
    
    }
}
