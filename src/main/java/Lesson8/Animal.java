package Lesson8;

public class Animal {

    public static void main(String[] args) {
        Root cat = new Cat("Кот", "Лео", "Бежевый", 2);
        Root dog = new Dog("Собака", "Барон", "Чёрный", 5);
        Root rabbit = new Rabbit("Кролик", "Малыш", "Белый", 1);

        ((Cat) cat).voice();
        ((Dog) dog).voice();
        ((Rabbit) rabbit).voice();

        Root[] animal = new Root[]{cat, dog, rabbit};




    }


}
