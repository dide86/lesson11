package ru.geekbrains.lessons.lesson11;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        String[] arr = {"4", "3", "2", "1"};

        System.out.println("Задание 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(arr);
        System.out.println("Задание 2\n" + list.getClass() + " : " + list);

        System.out.println("Задание 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес коробку с апельсинами 1 и коробку с яблоками: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес коробку с апельсинами 2 и коробку с яблоками: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}
