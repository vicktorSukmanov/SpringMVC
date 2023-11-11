package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarSevice {
    static List<Car> carList = getListCar();

    @Override
    public List<Car> getListCarCount(int count) {
        List<Car> cars = new ArrayList<>();
        try {

            if (count >= 5) {
                carList.stream().limit(5).forEach(car1 -> cars.add(car1));
                return cars;
            } else if (count <= 5) {
                carList.stream().limit(count).forEach(car1 -> cars.add(car1));
                return cars;
            }
        } catch (IllegalArgumentException e) {
            carList.stream().limit(0).forEach(car1 -> cars.add(car1));
            return cars;
        }

        return cars;
    }

    public static List<Car> getListCar() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedec", "E", 125));
        carList.add(new Car("Audi", "A8", 127));
        carList.add(new Car("Hundai", "Solaris", 352));
        carList.add(new Car("KIA", "RIO", 32));
        carList.add(new Car("Nissan", "Almera", 11));
        return carList;
    }


}
