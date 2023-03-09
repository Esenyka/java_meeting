import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//Создать файл с названием file.txt. Если файл уже есть, 
//то создавать не надо Записать в него Слово "TEXT" 100 раз

public class dz2_task2{
    public static void main(String[] args) throws IOException{
        try{
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));
            String text = "TEXT";
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            int count = 0;
            while(count != 100){
                os.write(bytes);
                count++;
            }
            os.flush();
            os.close();
            System.out.println("Все отлично, файл создан и запись сделана!");
        }
        catch (IOException e){
            System.out.println("Что-то пошло не так...");
        }
        
    }
}