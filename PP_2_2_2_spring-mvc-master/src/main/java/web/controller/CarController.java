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
        List<Car> cars =  new ArrayList<>();
        cars.add(new Car("BMW",325,"green"));
        cars.add(new Car("Lamborghini",500,"red"));
        cars.add(new Car("VW",150,"yellow"));
        cars.add(new Car("Škoda",110,"white"));
        cars.add(new Car("Lada",1,"grey"));
        if(count == null || Integer.valueOf(count) >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars",
                    SpringService.getCountCar(cars, Integer.valueOf(count)));
        }
        return "car";
    }
}
