package co.com.InternetDeLasCosas.api.Resource.Components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Temperature {
    @Id
    private String components_id;
    private String temperatura;
    private LocalDateTime fecha;

    // Constructor que toma un DatesRegisterComponents
    public Temperature(DatesRegisterTemperature datesRegisterTemperature) {
        this.temperatura= datesRegisterTemperature.temp();
        this.fecha = LocalDateTime.now();
    }


}
