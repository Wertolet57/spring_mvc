package service;


import model.Car;

import java.util.ArrayList;
import java.util.List;

public class SpringService {
    public static List<Car> getCountCar(int count) {
        List<Car> cars =  new ArrayList<>();
        cars.add(new Car("BMW",325,"green"));
        cars.add(new Car("Lamborghini",500,"red"));
        cars.add(new Car("VW",150,"yellow"));
        cars.add(new Car("Škoda",110,"white"));
        cars.add(new Car("Lada",1,"grey"));
        return cars.stream().limit(count).toList();
    }
}
