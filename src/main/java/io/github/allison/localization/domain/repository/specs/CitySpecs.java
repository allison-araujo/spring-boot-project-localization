package io.github.allison.localization.domain.repository.specs;

import io.github.allison.localization.domain.entity.City;
import org.springframework.data.jpa.domain.Specification;

public abstract class CitySpecs {

    public static Specification<City> nameEqual(String name){
        return (root, query, cb) -> cb.equal(root.get("name"), name);
    }

    public static Specification<City> populationGreaterThan(Integer value){
        return (root, query, cb) -> cb.greaterThan(root.get("population"), value);
    }
}
