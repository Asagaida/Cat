
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 2012, 8.15);
        Cat cat2 = new Cat("Matilda", 2015, 5.84);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        cat1.myaukanie();
    }
}
