package ecosystem.animal;

import ecosystem.plant.Plant;

public class Goat implements Herbivorous {
    @Override
    public void eat(Plant food) {
        System.out.println("Goat eats " + food.getClass().getName());
    }
}
