package com.vibha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello"); // hello refers to the jsp hello.jsp

		//setting the data
		modelAndView.addObject("id", 01);
		modelAndView.addObject("name", "Vibha");
		modelAndView.addObject("salary", 10000);

		return modelAndView;

		/*
		 * Holder for both Model and View in the web MVC framework. Note that
		 * these are entirely distinct. This class merely holdsboth to make it
		 * possible for a controller to return both modeland view in a single
		 * return value. Represents a model and view returned by a handler, to
		 * be resolvedby a DispatcherServlet. The view can take the form of a
		 * Stringview name which will need to be resolved by a ViewResolver
		 * object;alternatively a View object can be specified directly. The
		 * model is a Map, allowing the use of multiple objects keyed by name.
		 */
	}

}
