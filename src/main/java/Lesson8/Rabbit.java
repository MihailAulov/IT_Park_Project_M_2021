package Lesson8;

public class Rabbit extends Root {

    public Rabbit(String vid, String nickname, String coatColor, int age) {
        super(vid, nickname, coatColor, age);
    }

    public Rabbit() {
        super(voice);
        System.out.println("Кролик не издаёт звуков");
    }
}
