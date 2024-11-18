package co.com.InternetDeLasCosas.api.Resource.Components;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TemperatureRepository extends MongoRepository<Temperature,String> {

    Optional<Temperature> findTopByOrderByFechaDesc();
}
