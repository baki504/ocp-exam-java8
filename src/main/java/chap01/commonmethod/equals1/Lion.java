package chap01.commonmethod.equals1;

public class Lion {
    private int idNumber;
    private int age;
    private String name;

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
