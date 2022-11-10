package ua.edu.ucu.apps.demo;

import org.springframework.beans.factory.annotation.Autowired;
import ua.edu.ucu.apps.demo.flower_store.FlowerBucket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private String data;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
//	public List<FlowerBucket> hello() {
//		FlowerController flowerController = new FlowerController();
//		return flowerController.getFlower();
//	}
	public String hello(){
		return data;
	}

}
