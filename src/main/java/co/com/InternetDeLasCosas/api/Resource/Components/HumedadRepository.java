package co.com.InternetDeLasCosas.api.Resource.Components;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface HumedadRepository extends MongoRepository<Humedad,String> {

    Optional<Humedad> findTopByOrderByFechaDesc();
}
