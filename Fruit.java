package ru.geekbrains.lessons.lesson11;

abstract class Fruit {
    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}