package edu.citytech.cst.tictactoe.game.controller;

import edu.citytech.cst.tictactoe.game.businessobject.Winner;
import edu.citytech.cst.tictactoe.game.model.WinnerStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameController {
    @GetMapping("/tictactoe")
    public WinnerStatus getWinner(@RequestParam String moves){

        return new Winner().getWinnerStatus(moves);
    }
}
