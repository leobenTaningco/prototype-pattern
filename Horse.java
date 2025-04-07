class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4; 
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Yellow";
    }

    public Animal clone() {
        return new Horse();
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public String getType() {
        return "Horse";
    }

    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("Eating " + food);
    }

    public String getColor(){
        return color;
    }
}
