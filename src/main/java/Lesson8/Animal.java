package Lesson8;

public class Animal {

    public static void main(String[] args) {
        Cat cat = new Cat("Кот", "Лео", "Бежевый", 2);
        Dog dog = new Dog("Собака", "Шарик", "Чёрный", 8);
        Rabbit rabbit = new Rabbit("Кролик", "Малыш", "Белый", 1);


        Root[] singer = new Root[3];
        singer[0] = new Cat();
        singer[1] = new Dog();
        singer[2] = new Rabbit();
        for (int i = 0; i < singer.length; i++)
            singer[i].voice();

    }




}
