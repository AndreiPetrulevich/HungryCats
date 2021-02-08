package ru.geekbrains.hungryCats;

public class Main {

    public static void main(String[] args) {
	    Plate catPlate = new Plate();
        catPlate.addFeed();
        Cat [] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].eatTheFeed(catPlate);
        }
    }
}
