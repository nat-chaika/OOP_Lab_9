package ua.edu.ucu.apps.demo.flower_store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
//    private FlowerType type;
    private int price = 50;
    private FlowerColor color = FlowerColor.RED;


    public Flower() {
    }

    public Flower(int i, FlowerColor color) {
        setPrice(i);
        setColor(color);
    }


    public String getColor() {
        return this.color.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
