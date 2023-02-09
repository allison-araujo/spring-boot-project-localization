package io.github.allison.localization.domain.repository;

import io.github.allison.localization.domain.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    List<City> findByName(String name);


    @Query("select c from City c where upper(c.name) like upper(?1)")
    List<City> findByNameLike(String name);

    List<City> findByPopulation(Long population);

    List<City> findByNameStartingWith(String name);

    List<City> findByNameEndingWith(String name);

    List<City> findByNameContaining(String name);

    List<City> findByPopulationLessThan(Long population);

    List<City> findByPopulationGreaterThan(Long population);

    List<City> findByPopulationLessThanEqual(Long population);

    List<City> findByPopulationLessThanAndNameLike(Long population, String name);





}
