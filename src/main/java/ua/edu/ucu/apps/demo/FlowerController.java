package ua.edu.ucu.apps.demo;

import ua.edu.ucu.apps.demo.flower_store.FlowerBucket;
import ua.edu.ucu.apps.demo.flower_store.FlowerPack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<FlowerBucket> getFlower() {
        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(new Flower("blue", 15.0, 400), 5);
        flowerBucket.add(flowerPack);
        return List.of(flowerBucket);

    }
}
