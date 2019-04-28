package other.shoeisha;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 5-12
public class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Customer> list = Arrays.asList(
                new Customer(10, "Gold"),
                new Customer(11, "Silver"),
                new Customer(12, "Bronze"));

        Predicate<Customer> p = s -> s.getId() > 10;
        list = list.stream()
                .filter(p)
                .collect(Collectors.toList());
        Stream<String> name = list.stream().map(Customer::getName);
        name.forEach(n -> System.out.print(n + " "));

    }

}
