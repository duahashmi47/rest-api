package com.cwiztech.twoDapi;

import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cwiztech.arrayapi.services.twoDServices;

@RestController
@CrossOrigin
@RequestMapping("/twoDarray")

public class twoDController {
	@RequestMapping(value = "/traverse" , method = RequestMethod.GET)
	public String traverse() throws IOException{
		twoDServices obj = new twoDServices();
		return obj.traverse();	
	}
	
	@RequestMapping(value = "/insert/{value},{value}" , method = RequestMethod.POST)
	public String insert(@PathVariable int value) throws IOException{
		twoDServices obj = new twoDServices();
		return obj.insert(value);	
	}
	
	@RequestMapping(value = "/delete/{value}" , method = RequestMethod.DELETE)
	public String delete(@PathVariable int value) throws IOException{
		twoDServices obj = new twoDServices();
		return obj.delete(value);	
	}
	
	@RequestMapping(value = "/search/{value}" , method = RequestMethod.POST)
	public String search(@PathVariable int value) throws IOException{
		twoDServices obj = new twoDServices();
		return obj.search(value);	
	}

}
