import java.util.*;

public class dz5{
    public static void main(String[] args){
        Scanner IsScanner = new Scanner(System.in);
        System.out.println("Введите тект - ");
        String text = IsScanner.nextLine();

        collectStats(text);
    }
    static void collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();
        String[] textList = text.split(" ");
        for(String word: textList){
            if(stats.keySet().contains(word.length())){
                List<String> temp = new ArrayList<>(stats.get(word.length()));
                temp.add(word);
                stats.put(word.length(), temp);
            }
            else{
                stats.put(word.length(), Arrays.asList(word));
            }
        }
        Iterator<List<String>> itr = stats.values().iterator();
        while (itr.hasNext()) {
            System.out.println((itr.next().toString()));
        }

    }
}