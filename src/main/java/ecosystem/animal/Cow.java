package ecosystem.animal;

import ecosystem.plant.Plant;

public class Cow implements Herbivorous {
    @Override
    public void eat(Plant food) {
        System.out.println("Cow eats " + food.getClass().getName());
    }
}
