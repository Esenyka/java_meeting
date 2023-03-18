import java.util.*;

public class dz4_task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) listOfWords.add("0");

        while(true){
            Scanner IsScanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("Введите команду - ");
            String command = IsScanner.nextLine();
            
            if (command.indexOf("exit") != -1){
                System.out.println("Программа завершена!");
                break;}
            else if(listOfWords.contains(command)){
                System.out.println(listOfWords.lastIndexOf(command));
            }
            else if(isDigit(command)){
                System.out.println(listOfWords.get(Integer.parseInt(command)));
            }
            else if(command.indexOf("~") != -1){
                String[] text = command.split("~");
                int index = Integer.parseInt(text[1]);
                listOfWords.set(index, text[0]);
            }
            else{
                System.out.printl("Что-то пошло не так...");
            }    
        }
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try{
            Integer.parseInt(s);
            return true;
            }
        catch(NumberFormatException e){
            return false;
            }
        }
}
