import java.util.*;

public class dz3_task2{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);

        Iterator<String> col = list.iterator();
        while (col.hasNext()) {
            try{
                Integer.parseInt(col.next());
            }
            catch(NumberFormatException e){
                col.remove();
            }
        }

        System.out.println("***происходит магия***");
        System.out.println(list);
    }
}