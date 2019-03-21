package chap01.commonmethod.equals2;

public class LionEqualsBuilder {
    private int idNumber;
    private int age;
    private String name;

    public LionEqualsBuilder(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    public Lion build() {
        return new Lion(idNumber, age, name);
    }

}
