package Lesson8;

import java.util.Objects;

abstract class Root {
    public static boolean voice;
    String vid;
    String nickname;
    String coatColor;
    int age;


    public Root(String vid, String nickname, String coatColor, int age) {
        this.vid = vid;
        this.nickname = nickname;
        this.coatColor = coatColor;
        this.age = age;

    }

    public Root(boolean voice) {
    }

    @Override
    public String toString() {
        return "Root{" +
                "vid='" + vid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", coatColor='" + coatColor + '\'' +
                ", age=" + age +
                '}';
    }


    public static void voice() {
    }
}

