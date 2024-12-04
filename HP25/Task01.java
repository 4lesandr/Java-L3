public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

//Соглашения для equals(): рефлексивность, симметричность, транзитивность, согласованность, сравнение с null.

public class Task01 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}
