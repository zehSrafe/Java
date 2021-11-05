package be.intec.oef7.livingThings;

public class Snake extends Animal{
    public Snake(){
        this("Slippy");
    }

    public Snake(String name){
        super(name);
    }

    public void move(){
        System.out.println("Snake '" + super.getName() + "' slipped");
    }

    public void makeNoise(){
        System.out.println("Esssessssss");
    }
}
