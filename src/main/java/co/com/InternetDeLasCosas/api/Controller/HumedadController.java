package co.com.InternetDeLasCosas.api.Controller;

import co.com.InternetDeLasCosas.api.Resource.Components.Humedad;
import co.com.InternetDeLasCosas.api.Resource.Components.HumedadRepository;
import co.com.InternetDeLasCosas.api.Resource.Components.DatesRegisterHumedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/humedad")
public class HumedadController {

    @Autowired
    private HumedadRepository componentsRepository;


    @PostMapping("/addData")
    public Humedad addComponent(@RequestBody DatesRegisterHumedad datesRegisterHumedad) {
        System.out.println(datesRegisterHumedad);
        return componentsRepository.save(new Humedad(datesRegisterHumedad));
    }


    @GetMapping("/getAllData")
    public List<Humedad> getAllComponents(){
        return componentsRepository.findAll();
    }
    @GetMapping("/getData")
    public Humedad getLastComponent() {
        return componentsRepository.findTopByOrderByFechaDesc().orElse(null);
    }
}
