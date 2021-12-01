package Lesson8;

public class Dog extends Root {

    public Dog(String vid, String nickname, String coatColor, int age) {
        super(vid, nickname, coatColor, age);
    }

    public Dog() {
        super(voice);
        System.out.println("Собака издаёт звук Гав");
    }


}
