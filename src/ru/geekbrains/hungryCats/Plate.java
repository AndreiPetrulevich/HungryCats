package ru.geekbrains.hungryCats;

public class Plate {
    private int feed;

    public Plate() {
        this.feed = feed;
    }

    public int getFeed() {
        return feed;
    }

    public void addFeed() {
        if (feed == 0 || feed < 15) {
            feed += (int)(Math.random() * 80 + 20);
            System.out.println(feed);
        }
    }

    public boolean subtractFeed(int catWantEat) {
        if (catWantEat <= feed) {
            feed -= catWantEat;
            System.out.println("Eat feed: " + catWantEat);
            return true;
        }
        System.out.println("The cat did not have enough food.");
        return false;
    }
}
