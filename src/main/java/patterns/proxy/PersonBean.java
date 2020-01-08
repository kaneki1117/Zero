package patterns.proxy;

public class PersonBean implements IPersonalBean{
    private String name;
    private String gender;
    private String hobby;
    private String score;

    public PersonBean(String name, String gender, String hobby, String score) {
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
