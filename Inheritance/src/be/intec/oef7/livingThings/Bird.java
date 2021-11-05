package be.intec.oef7.livingThings;

public class Bird extends  Animal{
    public Bird(){
        this("Twitter");
    }

    public Bird(String name){
        super(name);
    }

    public void move(){
        System.out.println("Bird '" + super.getName() + "' moved");
    }

    public void makeNoise(){
        System.out.println("tweets");
    }
}
