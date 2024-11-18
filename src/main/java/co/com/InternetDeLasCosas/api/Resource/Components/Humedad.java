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
public class Humedad {
    @Id
    private String components_id;
    private String humedad;
    private LocalDateTime fecha;

    // Constructor que toma un DatesRegisterComponents
    public Humedad(DatesRegisterHumedad datesRegisterHumedad) {
        this.humedad= datesRegisterHumedad.humedad();
        this.fecha = LocalDateTime.now();
    }


}
