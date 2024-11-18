package co.com.InternetDeLasCosas.api.Controller;

import co.com.InternetDeLasCosas.api.Resource.Components.Temperature;
import co.com.InternetDeLasCosas.api.Resource.Components.TemperatureRepository;
import co.com.InternetDeLasCosas.api.Resource.Components.DatesRegisterTemperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    @Autowired
    private TemperatureRepository componentsRepository;


    @PostMapping("/addData")
    public Temperature addComponent(@RequestBody DatesRegisterTemperature datesRegisterTemperature) {
        System.out.println(datesRegisterTemperature);
        return componentsRepository.save(new Temperature(datesRegisterTemperature));
    }


    @GetMapping("/getAllData")
    public List<Temperature> getAllComponents(){
        return componentsRepository.findAll();
    }
    @GetMapping("/getData")
    public Temperature getLastComponent() {
        return componentsRepository.findTopByOrderByFechaDesc().orElse(null);
    }
}
