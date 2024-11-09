package com.cms.customer_management_sys;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "Finally Done...!";
    }

}
