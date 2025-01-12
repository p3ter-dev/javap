public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();
        Cat myCat = new Cat();
        myCat.eat();
        Dog myDog = new Dog();
        myDog.eat();
        System.out.println(myDog.getName("spike"));
        System.out.println(myDog.getAge(30));
        System.out.println(myDog.fleas(false));

        Animal myAnimal = new Animal("correy", 4);

        Dog myDog = new Dog("correy", 4, 5);
        System.out.println(myAnimal.getName() + " has " + myAnimal.getAge() + " fleas.");
    }
}
