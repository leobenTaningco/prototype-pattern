class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep("Sheep");
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep = new Sheep(name);
        return sheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}

