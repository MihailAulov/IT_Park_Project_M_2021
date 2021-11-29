package Lesson8;

public class Root {
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

    @Override
    public String toString() {
        return "Root{" +
                "vid='" + vid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", coatColor='" + coatColor + '\'' +
                ", age=" + age +
              '}';
    }
}



