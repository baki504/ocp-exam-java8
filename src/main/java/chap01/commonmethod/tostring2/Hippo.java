package chap01.commonmethod.tostring2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100);
        Hippo2 h2 = new Hippo2("Harry", 3100);
        System.out.println(h1);
        System.out.println(h2);

        System.out.println("---");

        System.out.println(ToStringBuilder.reflectionToString(h1));
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.DEFAULT_STYLE));
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.JSON_STYLE));
        System.out.println("-----");
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println("-----");
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.NO_CLASS_NAME_STYLE));
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.NO_FIELD_NAMES_STYLE));
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.SHORT_PREFIX_STYLE));
        System.out.println(ToStringBuilder.reflectionToString(h1, ToStringStyle.SIMPLE_STYLE));

    }
}


class Hippo2{
    private String name;
    private double weight;

    public Hippo2(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

}