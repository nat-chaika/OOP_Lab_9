package ua.edu.ucu.apps.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Flower extends ua.edu.ucu.apps.demo.flower_store.Flower {
    private String color;
    private double petal;
    private int price;
}
