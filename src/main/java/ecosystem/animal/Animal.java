package ecosystem.animal;

import ecosystem.Food;

public interface Animal<T extends Food> extends Food {
    default void eat(T food) {
        System.out.println(getSingleName(this.getClass().getName()) + " eats "
                + getSingleName(food.getClass().getName()));
    }

    default String getSingleName(String className) {
        int index = className.lastIndexOf('.') + 1;
        return className.substring(index);
    }
}
