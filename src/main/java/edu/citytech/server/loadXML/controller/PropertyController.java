package edu.citytech.server.loadXML.controller;


import edu.citytech.server.loadXML.Property;
import edu.citytech.server.loadXML.SelectProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties")

public class PropertyController {
    @GetMapping("/")
    public List<Property> getList(){
        return SelectProperties.findALl();
    }
}
