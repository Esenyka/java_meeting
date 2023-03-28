import java.util.*;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gander;
    int height;
    int weight; 

    Person(String personName, String personSurname, int personAge, String personGander){
        name = personName;
        surname = personSurname;
        age = personAge;
        gander = personGander;
    }

    @Override
    public String toString() {
        String result = String.format("name - %s, surname - %s, gander - %s, age - %s", name, surname, gander, age);
        return result;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, surname);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && Objects.equals(surname, anotherPerson.surname);
    }

    public String bodyMassIndex() {
        int result = weight / (height * height);
        if (result <= 18){
            return "Дефицит";
        }
        else if (result <= 25){
            return "Норма";
        }
        else{
            return "Избыток";
        }
    }
}