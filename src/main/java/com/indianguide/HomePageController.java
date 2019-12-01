/**
 * 
 */
package com.indianguide;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomePageController {

    @RequestMapping("/")
    public ModelAndView homePage() throws Exception {
        ModelAndView modelAndView = new ModelAndView("/pages/home/homePage.xhtml");
        return modelAndView;
    }
}