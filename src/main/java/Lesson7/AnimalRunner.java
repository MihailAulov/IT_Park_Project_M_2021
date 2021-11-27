package Lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.view = "Кот";
        cat.run = 200;
        cat.swim = 0;

        Animal dog = new Animal();
        dog.view = "Собака";
        dog.run = 500;
        dog.swim = 10;

        Animal tiger = new Animal();
        tiger.view = "Тигр";
        tiger.run = 1000;
        tiger.swim = 500;

        Animal rabbit = new Animal();
        rabbit.view = "Кролик";
        rabbit.run = 50;
        rabbit.swim = 0;

        System.out.println("Собака можеть пробежать " + dog.run + " метров ");

        Animal [] animals = new Animal[] {cat, dog, tiger, rabbit};
        for (Animal animal : animals){
            if (0 == animal.swim){
                System.out.println(" Животное " + animal.view + " не может плавать ");
            }
        }
    }
}

