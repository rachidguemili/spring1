package com.rachidguemili.springproject.ControllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {

    @GetMapping("/Doctor/1")
    @ResponseBody
    public String pageWilliam()
    {
        return  "William Hartnell";
    }

    @GetMapping("/Doctor/10")
    @ResponseBody
    public String pageDavid()
    {
        return  "David Tennant";
    }
    @GetMapping("/Doctor/13")
    @ResponseBody
    public String pageJodie()
    {
        return  "Jodie Whittaker" ;
    }

}
