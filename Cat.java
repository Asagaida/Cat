/**
 Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
 Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
 класса. Использовать эти объекты.
 */
public class Cat {
    private String name;
    private int yearOfBirth;
    private double weight;

    Cat (){
        super();
    }

    Cat (String name, int yearOfBirth, double weight){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
        this.weight=weight;
    }




    void myaukanie(){
        System.out.println("Мяу-Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", weight=" + weight +
                '}';
    }
}
