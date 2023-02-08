package io.github.allison.localization;

import io.github.allison.localization.domain.entity.City;
import io.github.allison.localization.domain.repository.CityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

	@Autowired
	private CityRepository cityRepository;
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Inicializado..!");

		listCity();

	}

	@Transactional
	void saveCity(){
		var city = new City(1L,"Corumba",13000L);
		cityRepository.save(city);

	}


	void listCity(){
		cityRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);
	}

}
