public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Katten mjaver");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}

