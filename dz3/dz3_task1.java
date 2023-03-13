import java.util.*;


public class dz3{
    public static void main(String[] args){
        Scanner IsScanner1 = new Scanner(System.in);
        System.out.println("Введите длину списка - ");
        int list_lenght = IsScanner1.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<list_lenght;i++){
            Scanner IsScanner2 = new Scanner(System.in);
            System.out.println("Введите элемент списка - ");
            int elements = IsScanner1.nextInt();
            list.add(elements);
        }

        System.out.println(list);

        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            if (col.next() % 2 == 0){
                col.remove();
            } 
        }
        System.out.println(list);
    }
}
