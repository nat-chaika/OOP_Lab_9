package ua.edu.ucu.apps.demo.flower_store;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;


    public FlowerPack(Flower flower, int i) {
        this.setFlower(flower);
        this.setAmount(i);
    }
    public int getPrice() {
        return this.flower.getPrice() * this.amount;
    }
}
