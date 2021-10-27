package com.codingdojo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.models.NinjaCode;

@Controller
@SpringBootApplication
public class TheCodeApplication {
	private static ArrayList<NinjaCode> secretList =new ArrayList<NinjaCode>();

	public static void main(String[] args) {
		secretList.add( new NinjaCode( "Loyalty" ) );
		secretList.add( new NinjaCode( "Courage" ) );
		secretList.add( new NinjaCode( "Veracity" ) );
		secretList.add( new NinjaCode( "Compassion" ) );
		secretList.add( new NinjaCode( "Honor" ) );
		
		SpringApplication.run(TheCodeApplication.class, args);
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String homePage( Model model ) {
		return "index.jsp";
	}
	
	@RequestMapping( value = "/code", method = RequestMethod.GET )
	public String secretPage( Model model ) {
		model.addAttribute( "secretList", secretList );
		return "code.jsp";
	}
	
	@RequestMapping( value = "/validate", method = RequestMethod.POST )
	public String validateCode( @RequestParam( value = "secretCode" ) String secretCode,
								RedirectAttributes redirectAttributes ) {
		if( secretCode.equals("bushido") ) {
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("errorAlert", "You do not know the way, yet! Try again!");
		return "redirect:/";
	}
	

}
