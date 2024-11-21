public class Constructors {
    public static void main(String[] args) {
        Human human = new Human("peter", 22, 56.8);
        Human person = new Human("levy", 7, 30);
        System.out.println(human.name + " with the age of " + human.age + " and his weight is " + human.weight);
        System.out.println(person.name + " with the age of " + person.age + " and his weight is " + person.weight);
        
        human.drink(); 
        human.eat();
        
        person.eat();
        person.drink();
    }
}
