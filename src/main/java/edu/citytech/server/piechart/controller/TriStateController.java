package edu.citytech.server.piechart.controller;

import edu.citytech.server.piechart.GroupByState;
import edu.citytech.server.piechart.GroupByStateDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.GroupPrincipal;
import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/triState")
public class TriStateController {
    @GetMapping("")
    public List<GroupByState> getAll(){
        Predicate<GroupByState> predicate = e -> e.getState().equals("NY")||
                e.getState().equals("CT") ||
                e.getState().equals("NJ");

        var list = GroupByStateDAO.findAll().stream().filter(predicate).toList();
        return list;
    }
}
