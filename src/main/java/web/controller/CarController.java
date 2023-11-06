package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "6") int count, ModelMap model) {
        try {
            if (count >= 5) {
                List<Car> cars = CarServiceImpl.getListCarCount(5);
                model.addAttribute("cars", cars);
            } else if (count <= 5) {
                List<Car> cars = CarServiceImpl.getListCarCount(count);
                model.addAttribute("cars", cars);
            }
        } catch (IllegalArgumentException e) {

            List<Car> cars = CarServiceImpl.getListCarCount(0);
            model.addAttribute("cars", cars);
        }
        return "cars/cars";
    }
}
