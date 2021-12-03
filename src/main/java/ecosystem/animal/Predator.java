package ecosystem.animal;

public interface Predator extends Animal<Animal> {
    @Override
    default void eat(Animal animal) {
        if (animal.getClass().equals(this.getClass())) {
            System.out.println(getSingleName(this.getClass().getName()) + " can't eat "
                    + getSingleName(animal.getClass().getName()));
            return;
        }
        Animal.super.eat(animal);
    }
}
