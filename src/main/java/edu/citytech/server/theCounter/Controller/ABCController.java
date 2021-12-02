package edu.citytech.server.theCounter.Controller;


import edu.citytech.server.theCounter.service.ABCService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alphabets")
public class ABCController {
    @GetMapping("/abc")
    public Character[] countABC(){

        return ABCService.getABC();
    }
}
