public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Sheep sheep = (Sheep) sheep1;
        sheep1.makeSound(); 
        sheep.eat();
        sheep1.clone();

        Animal cow1 = registry.createCow();
        cow1.makeSound(); 

        Animal horse1 = registry.createHorse();
        horse1.makeSound();
    }
}