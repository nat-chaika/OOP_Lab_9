package ua.edu.ucu.apps.demo.flower_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    private final ArrayList<FlowerBucket> storage = new ArrayList<>();
    private final List<String> storage_labels = new ArrayList<>();
    private final List<Flower> storage_flowers = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FlowerPack fP1 = new FlowerPack(new Chamomile(), 32);
        FlowerPack fp2 = new FlowerPack(new Rose(), 7);
        FlowerBucket bouq1 = new FlowerBucket();
        bouq1.add(fP1);
        bouq1.add(fp2);
        FlowerPack fp3 = new FlowerPack(new Tulip(), 11);
        FlowerBucket bouq2 = new FlowerBucket();
        bouq2.add(fp3);
        FlowerPack fP4 = new FlowerPack(new Rose(), 1);
        FlowerBucket bouq3 = new FlowerBucket();
        bouq3.add(fP4);
        Store myStore = new Store();
        myStore.addBuket(bouq1);
        myStore.addBuket(bouq2);
        myStore.addBuket(bouq3);
        myStore.search();
    }

    private void addBuket(FlowerBucket bouquet) {
        storage.add(bouquet);
        if (!storage_labels.contains(bouquet.getLabel())) {
            storage_labels.add(bouquet.getLabel());
        }
        for (Flower flower: bouquet.getFlowers()) {
            if (!storage_flowers.contains(flower)) {
                storage_flowers.add(flower);
            }
        }
    }

    public void search() {
        System.out.println("Вас вітає флористичний магазин \"Бу́кет\"");
            if (!storage.isEmpty()) {
                System.out.println("Сьогодні серед опцій знаходяться такі категорії:");
                storage_labels.forEach(System.out::print);
                System.out.println("\nТо що паноньки бажають? (Введіть цифру)");
                boolean guess =true;
                while (guess) {
                    String labl = scanner.nextLine();
                    if (labl.equals("1") || labl.equals("2") || labl.equals("3")) {
                        for (int i = 0; i < storage_labels.size(); i++) {
                            if (!storage_labels.get(i).contains(labl) && guess) {
                                if (i == storage_labels.size() - 1) {
                                    System.out.println("Ви точно щось попутали. Спробуйте знову: ");
                                    break;
                                }
                            }
                            else if (guess){
                                System.out.println("Сьогодні вам пощастило. Ви можете вибрати серед:");
                                int n = 0;
                                for (FlowerBucket bouquet : storage) {
                                    if (bouquet.getLabel().contains(labl)) {
                                        n++;
                                        System.out.println(n + ". " + bouquet);
                                    }

                                }
                                while (true) {
                                    String buk = scanner.nextLine();
                                    int c;
                                    try {c = Integer.valueOf(buk);}
                                    catch(Exception NumberFormatException) {
                                        System.out.println("Перегляньте вашу відповідь.");
                                        continue;}
                                    if ( c >= 1 && c <= n) {
                                        System.out.println("Супер! Вітаю з вибором! Оплатіть будь ласка на карту");
                                        System.out.println("0992456355899877");
                                        System.out.println("Дякую, бувайте!");
                                        guess = false;
                                        break;
                                    }
                                    System.out.println("Ну що, невже не видно, що такого не існує!");
                                }
                            }
                        }
                    break;
                    }
                    System.out.println("Знову це. Ви не чітко прочитали умову. Try again");
                }
            }
            else { System.out.println("Схоже вам не пощастило, ми вже зачиняємося, побачимося завтра!"); }
    }
}
