public class Dog extends Animal implements Pet{

    public Dog(String name, int age, AnimalType[] type, String habitat){
        super(name, age, type, habitat);
    }


    public void makeVoice(){
        System.out.println("Bark!");
    }

    @Override
    public void playWith() {
        System.out.println("playing");
    }

}
