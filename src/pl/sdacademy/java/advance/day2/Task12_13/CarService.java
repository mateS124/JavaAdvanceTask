package pl.sdacademy.java.advance.day2.Task12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private  final List<Car> cars = new ArrayList<>();

    public void add(Car car){
        cars.add(car);
    }

    public void remove(Car car){
        cars.remove(car);
    }

    public List<Car> getAll(){
      //  return cars;           //operujemy na tej samej liście  cars co powoduje ze final nie dziła i możemy ja zmieniać
       // return List.copyOf(cars); //teorzy niemodyfikowalną liste , nie możemy modyfikować (final) cars, wyrzuca wyjątek
        return new ArrayList<>(cars); // tworzy modyfikowalną liste (kopię)
    }

    public List<Car> getCarsWithV12Engine(){
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12) )
                .collect(Collectors.toList());
               //.toList() w nowszej wersji Java

    }

    public List<Car> getCarsProducedBefore1999(){  //zwracamy listę aut dlatego List<Car>
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar(){  //zwracamy jedno najdroższe auto dlatego Car nie List<Car>
//        return (List<Car>) cars.stream()
//                .max(Comparator.comparing(car -> car.getPrice()))
//                .get();
         return cars.stream()
                 .max(Comparator.comparingDouble(Car::getPrice))
                 .get();
    }

    public Car getCheapestCar(){  //zwracamy jedno najdroższe auto dlatego Car nie List<Car>

        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .get();
    }

    public List<Car> getCarsWithMoreThan2Manufacturer(){  //zwracamy listę aut dlatego List<Car>
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 2)
                .collect(Collectors.toList());
    }

    public List<Car> gstCarsMadeBByProducer(Manufacturer manufacturer){
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }


}

