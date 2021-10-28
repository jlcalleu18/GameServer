package edu.citytech.cst.tictactoe.numbers.controller;

import edu.citytech.cst.tictactoe.numbers.service.NumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class NumberController {
    @GetMapping("/123")
    public int[] count123(@RequestParam (defaultValue = "100")int limit){

        return NumberService.get123(limit);
    }
}
