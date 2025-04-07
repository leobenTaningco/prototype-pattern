class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(String name) {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = name;
    }

    public Animal clone() {
        return new Sheep(this.name);
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public String getType() {
        return "Sheep";
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("Eating " + food);
    }

    public int getLegs(){
        return legs;
    }
}