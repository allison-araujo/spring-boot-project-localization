package io.github.allison.localization.service;


import io.github.allison.localization.domain.entity.City;
import io.github.allison.localization.domain.repository.CityRepository;
import static io.github.allison.localization.domain.repository.specs.CitySpecs.*;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService(CityRepository repository){
        this.cityRepository = repository;
    }

   public void listCityWhinPopulation(){
        cityRepository.findByPopulationLessThanAndNameLike(1000001L,"La%" ).forEach(System.out::println);

    }

    @Transactional
    void saveCity(){
        var city = new City(1L,"Corumba",13000L);
        cityRepository.save(city);

    }

    public void listCity(){
		cityRepository.findAll().forEach(System.out::println);
	}

    public void listCityName(){
        Pageable pageable = PageRequest.of( 0, 3);
        cityRepository
                .findByNameLike("%%%%", pageable)
                .forEach(System.out::println);

    }

   public void listCityPopulation(){
        cityRepository.findByPopulation(1264545L).forEach(System.out::println);
    }


    public List<City> filterDinamico(City city){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.STARTING);


        Example<City> example = Example.of(city, matcher);

        return cityRepository.findAll(example);


    }

    public void listCityByNameSpec(){
        cityRepository
                .findAll(nameEqual("Corumba").or(populationGreaterThan(1000))).forEach(System.out::println);
    }
}



