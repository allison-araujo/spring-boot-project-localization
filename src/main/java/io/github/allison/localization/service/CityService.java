package io.github.allison.localization.service;


import io.github.allison.localization.domain.entity.City;
import io.github.allison.localization.domain.repository.CityRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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


    public List<City> filterDinamic(City city){
        return cityRepository.findByPopulationLessThanAndNameLike(city.getPopulation(), city.getName());


    }
}



