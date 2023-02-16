package io.github.allison.localization;

import io.github.allison.localization.domain.entity.City;
import io.github.allison.localization.domain.repository.CityRepository;
import io.github.allison.localization.service.CityService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

	@Autowired
	private CityService cityService;
	@Override
	public void run(String... args) throws Exception{
		var city = new City(1L, "Corumba", 100L);
		cityService.listCitySpecssFilterDinamic(city);

	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);
	}

}
