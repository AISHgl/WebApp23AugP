package com.globallogic.controller;

import java.sql.Connection;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.globallogic.dao.MyConnection;
import com.mysql.cj.xdevapi.Statement;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	@RequestMapping(method=RequestMethod.GET , path ="/")
	public ModelAndView getMessage(@RequestParam Map<String,String>map) throws Exception{
		
		Connection conn=null;
		//connection
		MyConnection connection=new MyConnection();
		conn=connection.getConnection();
		//connection
	    java.sql.Statement st=conn.createStatement();
		

		map.forEach((k,v)->System.out.println("key "+k+"value "+v));
		System.out.println("HelloController GETTT");
		//Constructor with name mod3el and view
		//objectName //ClassName =new oBjname("viewName");
		ModelAndView modelAndView=new ModelAndView("/home");
		String name="Aish";
		modelAndView.addObject("name",name);
		modelAndView.addObject("age",23);
		modelAndView.addObject("salary",2500);
		
		System.out.println("?");
		return modelAndView;
	}
	
	//@RequestMapping(method = RequestMethod.GET , path= "/")
   // public void getMessage() {
		//System.out.println("Hello controller get");
		//System.out.println("?");
	//}
	@RequestMapping(method = RequestMethod.POST , path="/")
	public void getMessagePost() {
		System.out.println("Hello Controller post");
		System.out.println("?");
	}
	@RequestMapping(method =RequestMethod.PUT,path="/")
	public void putMessage() {
		System.out.println("HelloController put");
		System.out.println("?");
	}
	@RequestMapping(method= RequestMethod.DELETE,path="/")
	public void deleteMessagePost() {
		System.out.println("Hello Controler Deletelete");
		System.out.println("?");
	}
}
