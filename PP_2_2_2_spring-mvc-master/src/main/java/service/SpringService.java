package service;


import model.Car;

import java.util.List;

public class SpringService {
    public static List<Car> getCountCar(List<Car>cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
