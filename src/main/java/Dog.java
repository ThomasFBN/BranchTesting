public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hunden gøer");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean showMood) {
        if (showMood = true) {
            System.out.println("logrer");
        } else {
            System.out.println("knurrer");        }
    }

}
