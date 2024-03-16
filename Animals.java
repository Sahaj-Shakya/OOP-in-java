class Animal {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Cheetah {
    public void move(){
        System.out.println("Cheetah runs really fast.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
