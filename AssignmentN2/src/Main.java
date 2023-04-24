public class Main {
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Rex",5, new AnimalType[]{AnimalType.MAMMAL},"backyard");
        System.out.println(myDog.getName() + " " + myDog.getAge() +
                " " + myDog.getType() + " " + myDog.getHabitat());
        

        Parrot myParrot = new Parrot("Chad",2, new AnimalType[]{AnimalType.BIRD},"Cage");
        System.out.println(myParrot.getName() + " " + myParrot.getAge() +
                " " + myParrot.getType() + " " + myParrot.getHabitat());

    }
}