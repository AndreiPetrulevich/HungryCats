package ru.geekbrains.hungryCats;

public class Cat {
    boolean isFedUp = false;
    int saturation;

    public Cat() {
        this.saturation = (int)(Math.random() * 5 + 15);
    }

    public void eatTheFeed(Plate plate) {
        if (!isFedUp) {
            isFedUp = plate.subtractFeed(this.saturation);
        }
    }


}
