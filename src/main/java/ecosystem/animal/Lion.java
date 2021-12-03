package ecosystem.animal;

public class Lion implements Predator{
    @Override
    public void eat(Herbivorous food) {
        System.out.println("Lion eats " + food.getClass().getName());
    }
}
