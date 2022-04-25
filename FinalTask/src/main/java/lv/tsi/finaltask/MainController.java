package lv.tsi.finaltask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MainController {

    @Autowired
    private  CarRepository carRepository;

    @GetMapping("/info")
    public String info() {
        return "Maupas Bastien" +
                " " +
                "4004BDF" +
                " " +
                "Variant 2" +
                " " +
                "20/04";
    }

    @GetMapping("/getCars")
    public ResponseEntity<Iterable<Car>> getCars(){
        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getCar")
    public ResponseEntity<Optional<Car>> getCar(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(carRepository.findById(Math.toIntExact(id)), HttpStatus.OK);
    }

    @GetMapping(path="/totalprice")
    public double getTotal(){
        return carRepository.findAll()
                .stream()
                .mapToDouble(Car::getPrice)
                .sum();
    }

    }


