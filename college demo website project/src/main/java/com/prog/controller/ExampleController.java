package com.prog.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/setSessionAttribute")
    @ResponseBody
    public String setSessionAttribute(@RequestParam("value") String value, HttpSession session) {
        // Set a session attribute
        session.setAttribute("exampleAttribute", value);
        return "Session attribute set successfully";
    }

    @GetMapping("/getSessionAttribute")
    @ResponseBody
    public String getSessionAttribute(HttpSession session) {
        // Get a session attribute
        String attributeValue = (String) session.getAttribute("exampleAttribute");
        if (attributeValue != null) {
            return "Session attribute value: " + attributeValue;
        } else {
            return "Session attribute not found";
        }
    }
}
