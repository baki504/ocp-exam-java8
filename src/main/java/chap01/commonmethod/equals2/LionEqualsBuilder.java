package chap01.commonmethod.equals2;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LionEqualsBuilder extends Lion {

    public LionEqualsBuilder() {
        super();
    }

    public LionEqualsBuilder setIdNumber(int idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    public LionEqualsBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public LionEqualsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LionEqualsBuilder))
            return false;
        Lion other = (Lion) obj;

        System.out.println("this   : " + ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE));
        System.out.println("other  : " + ToStringBuilder.reflectionToString(other, ToStringStyle.DEFAULT_STYLE));

        return new EqualsBuilder().appendSuper(super.equals(obj)).append(name, other.name).isEquals();
    }

    public static void main(String[] args) {
        LionEqualsBuilder l1 = new LionEqualsBuilder().setIdNumber(1).setAge(5).setName("duke");
        LionEqualsBuilder l2 = new LionEqualsBuilder().setIdNumber(1).setAge(6).setName("duke");
        System.out.println(l1.equals(l2));
    }

    public Lion build() {
        return new Lion(idNumber, age, name);
    }

}
