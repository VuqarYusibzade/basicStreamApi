import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Vuqar", "Yusibzade", "22"));
        personList.add(new Person(1, "Ulvi", "Matrix Xetasi", "21"));
        personList.add(new Person(1, "Name", "Surname", "29"));

        System.out.println("18 yaşdan böyüklər:");
        personList.stream()
                .filter(person -> Integer.parseInt(person.getAge()) > 18)
                .forEach(person -> System.out.println(person.getName() + " " + person.getSurname()));


        double averageAge = personList.stream()
                .mapToInt(person -> Integer.parseInt(person.getAge()))
                .average()
                .orElse(0.0);
        System.out.println("Orta yaş: " + averageAge);


        int sumOfAgesOver18 = personList.stream()
                .filter(person -> Integer.parseInt(person.getAge()) > 18)
                .mapToInt(person -> Integer.parseInt(person.getAge()))
                .sum();
        System.out.println("18 yaşdan böyüklər: " + sumOfAgesOver18);
    }
}

class Person {
    private int id;
    private String name;
    private String surname;
    private String age;


    public Person(int id, String name, String surname, String age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
