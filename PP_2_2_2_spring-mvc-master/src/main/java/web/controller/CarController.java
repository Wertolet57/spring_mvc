package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.SpringService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) String count,
                           ModelMap model) {
        if(count == null || Integer.valueOf(count) >= 5) {
            count = "5";
        }
        model.addAttribute("cars",
                SpringService.getCountCar(Integer.valueOf(count)));
        return "car";
    }
}
