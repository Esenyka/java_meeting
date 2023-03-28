import java.util.*;;

public class Main{
    public static void main(String[] args){
        Person per1 = new Person("Masha", "Philipova", 20, "female");
        Person per2 = new Person("Petya", "Philipov", 25, "male");
        Person per3 = new Person("Vasya", "Shishcov", 30, "male");
        Person per4 = new Person("Marina", "Pupkina", 27 , "female");

        String res = per4.bodyMassIndex();
        System.out.println(res);

        List<Integer> arrayPeople = new LinkedList<>();
        arrayPeople.add(per1.getAge());
        arrayPeople.add(per2.getAge());
        arrayPeople.add(per3.getAge());
        arrayPeople.add(per4.getAge());

       for(int i: arrayPeople){
        if (i > 20){
            System.out.println(i);
        }
       }
    }
}