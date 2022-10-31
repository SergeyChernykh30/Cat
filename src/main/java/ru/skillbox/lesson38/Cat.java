package ru.skillbox.lesson38;

import java.util.Objects;

public class Cat {
    private final double originWeigth;
    private double weight;
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private static final int EYE_COUNT = 2;
    private static int count;
    private CatColor catColor;
    private String name;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeigth = weight;
        count++;
    }


    public Cat(double weight) {
        this.originWeigth = weight;
        this.weight = weight;
        count++;
    }

    public void meow() {
        weight = weight - 1;
        if (weight < MIN_WEIGHT) {
            count -= 1;
        }
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;

        if (weight > MAX_WEIGHT) {
            count -= 1;
        }
    }

    public Double getFeedAmount() {
        return weight - originWeigth;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void toilet() {
        weight = weight - 10;
        System.out.println("main.java.ru.skillbox.lesson38.Cat is go to toilet :)");
    }


    public Cat fullCopyCat() {
        Cat copyCat = new Cat(this.getOriginWeigth());

        copyCat.setWeight(this.getWeight());
        copyCat.setWeight(this.getWeight());
        copyCat.setName(this.getName());
        copyCat.setCatColor(this.getCatColor());

        return copyCat;
    }

    public static int getCount() {
        return count;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double setWeight) {
        this.weight = setWeight;
    }

    public double getOriginWeigth() {
        return originWeigth;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeigth) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public CatColor getCatColor() {
        return catColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String setName) {
        this.name = setName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return Double.compare(cat.originWeigth, originWeigth) == 0 && Double.compare(cat.weight, weight) == 0 && catColor == cat.catColor && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originWeigth, weight, catColor, name);
    }
}