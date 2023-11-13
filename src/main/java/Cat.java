public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Katten mjaver");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean showMood) {
        if (showMood = true) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");        }
    }

}



