package be.intec.oef7.livingThings;

public class Cat extends Animal{
    public Cat(){
        this("Catto");
    }

    public Cat(String name){
        super(name);
    }

    public void move(){
        System.out.println("Cat '" + super.getName() + "' moved");
    }

    public void makeNoise(){
        System.out.println("Meow");
    }
}
