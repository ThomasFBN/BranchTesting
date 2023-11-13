public class Main {
    public static void main(String[] args) {


        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
        animal1.eat("Mad");
        animal2.eat("mad");
        animal1.showMood(true);
        animal2.showMood(false);


    }

}