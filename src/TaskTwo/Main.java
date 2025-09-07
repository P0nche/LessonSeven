package TaskTwo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Apple apple = new Apple();

        Class<? extends Apple> clazz = apple.getClass();

        Field[] fields = clazz.getDeclaredFields();

        fields[0].setAccessible(true);
        fields[0].set(apple, "green");
        fields[0].setAccessible(false);

        System.out.println(apple.getColor());
    }
}
