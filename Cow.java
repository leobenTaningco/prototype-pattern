class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4; 
        this.sound = "Moo";
        this.food = "Grass";
    }

    public Animal clone() {
        return new Cow();
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public String getType() {
        return "Cow";
    }

    public void eat(){
        System.out.println("Eating " + food);
    }

    public int getLegs(){
        return legs;
    }
}
