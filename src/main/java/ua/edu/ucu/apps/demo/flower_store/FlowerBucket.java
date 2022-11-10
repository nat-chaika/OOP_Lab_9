package ua.edu.ucu.apps.demo.flower_store;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class FlowerBucket {
    private int price;
    private String label;
    private ArrayList<Flower> flowers = new ArrayList<>();
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public void add(FlowerPack pack) {
        this.flowerPacks.add(pack);
        this.setPrice(this.getPrice()+pack.getPrice());
        this.setLabel();
        if (!this.flowers.contains(pack.getFlower())) {
            flowers.add(pack.getFlower());
        }
    }

    private void setLabel() {
    if (this.getPrice() >= 1000) {
        this.label = "Преміум букети(1)";
    } else if (this.getPrice() < 1000 & this.getPrice() >= 600) {
        this.label = "Букети середньої вартості (2)";
    }
    else {
        this.label = "Дешевий віник(3)";
    }
    }
    public String toString() {
        String string = "The bouquet with";
        for (Flower flower:flowers) {
            string += " " + flower.toString() + "s";
        }
        string += new StringBuilder().append(". The price for it is ").append(this.getPrice());
        return string;
    }
}
