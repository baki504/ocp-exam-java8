package chap03.comparable;

// compareTo() and equals() Consistency
// This class defines a compareTo() method that is not consistent with equals:
public class Product implements Comparable<Product> {
    int id;
    String name;

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}

// You might be sorting Product objects by name, but names are not unique.
// Therefore, the return value of compareTo() might not be 0 when comparing two equal Product objects,
// so this compareTo() method is not consistent with equals.
// One way to fix that is to use a Comparator to define the sort elsewhere.
