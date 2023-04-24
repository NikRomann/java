
public class Parrot extends Animal implements Pet, Bird{

    public Parrot(String name, int age, AnimalType[] type, String habitat){
        super(name, age, type, habitat);
    }

    public void makeVoice(){
        System.out.println("whistle!");
    }


    @Override
    public void playWith() {
        System.out.println("playing");
    }

    public void fly() {
        System.out.println("flying");
    }

}
