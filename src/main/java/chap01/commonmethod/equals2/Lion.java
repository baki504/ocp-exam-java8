package chap01.commonmethod.equals2;

public class Lion {
    protected int idNumber;
    protected int age;
    protected String name;

    public Lion() {
    }

    public Lion(int idNumber, int age, String name) {
        super();
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Lion))
            return false;

        Lion otherlion = (Lion) obj;

        return this.idNumber == otherlion.idNumber;
    }
}
