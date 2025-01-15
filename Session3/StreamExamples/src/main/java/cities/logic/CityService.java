package cities.logic;

import cities.data.City;

import java.util.Comparator;
import java.util.List;

public class CityService<T> {
    public List<City> getCitiesSortedDescendend(List<City> cities, boolean isAscending) {
        Comparator<City> cityComparator =
                isAscending ? (city1, city2) -> city1.amountCitizens() - city2.amountCitizens() :
                        (city1, city2) -> city2.amountCitizens() - city1.amountCitizens();
        return cities.stream()
                .sorted(cityComparator)
                .toList();
    }

}
