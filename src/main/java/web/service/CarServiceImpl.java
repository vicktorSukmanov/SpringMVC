package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl {

    public static List<Car> getListCarCount(int count){
        Car car = new Car();
        List<Car> cars = new ArrayList<>();
        car.getListCar().stream().limit(count).forEach(car1 ->cars.add(car1) );
        return cars;
    }



}
