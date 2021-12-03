package ecosystem.animal;

import ecosystem.Food;

public interface Animal<T extends Food> {
    void eat(T food);
}
