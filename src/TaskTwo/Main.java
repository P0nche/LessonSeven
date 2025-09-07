package TaskTwo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Apple apple = new Apple();

        Class<? extends Apple> clazz = apple.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + " " + f.getType());
            f.setAccessible(true);
            f.set(apple, "green");
            f.setAccessible(false);
        }

        System.out.println(apple.getColor());
    }
}
