package Lesson8;

public class Cat extends Root {

    public Cat(String vid, String nickname, String coatColor, int age) {
        super(vid, nickname, coatColor, age);
    }

    public void voice (){
        System.out.println("Кошка издаёт звук Мяу");
    }
}
