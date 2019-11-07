package pbo1.pkg10118033.latihan53;

public class Rabbit extends Animal {
    private final String color, name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
        System.out.println("Hello, his name is "+name);
        System.out.println(name+" is Vegetarian? "+veg);
        System.out.println(name+" eats "+food);
        System.out.println(name+" has "+legs+" legs");
        System.out.println(name+" color is "+color);
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}