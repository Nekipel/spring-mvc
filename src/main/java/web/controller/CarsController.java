package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCarsSize(ModelMap model,
            @RequestParam(value = "count", defaultValue = "0") int count) {
        CarService service = new CarServiceImp();
        List<Car> cars = service.getCarsSize(count);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
