package chap01.commonmethod.equals2;

import org.apache.commons.lang3.builder.EqualsBuilder;

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
        if (!(obj instanceof LionEqualsBuilder))
            return false;
        Lion other = (Lion) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj)).append(idNumber, other.idNumber)
                .append(name, other.name).isEquals();
    }

    public static void main(String[] args) {
        LionEqualsBuilder l1 = new LionEqualsBuilder(1, 5, "duke");
        LionEqualsBuilder l2 = new LionEqualsBuilder(1, 5, "duke");
        LionEqualsBuilder l3 = l1;
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }

}
