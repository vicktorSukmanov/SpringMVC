package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import web.service.CarSevice;

import java.util.List;

@Controller
public class CarController {
    private CarSevice carSevice;

    @Autowired
    public CarController(CarSevice carSevice) {
        this.carSevice = carSevice;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "6") int count, ModelMap model) {

        List<Car> cars = carSevice.getListCarCount(count);
        model.addAttribute("cars", cars);

        return "cars/cars";
    }
}
