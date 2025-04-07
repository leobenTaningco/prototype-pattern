class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Horse() {
        this.legs = 4; 
        this.sound = "Neigh";
        this.food = "Hay";
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
}
