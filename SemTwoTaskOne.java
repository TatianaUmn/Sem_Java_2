import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    Задача 1. Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/WARNING.
*/

public class SemTwoTaskOne {
    public static void main(String[] args) throws IOException {
        
        List<String> listOfStrings = new ArrayList<String>();
       
        BufferedReader bf = new BufferedReader(new FileReader("log1.txt"));
       
        String line = bf.readLine();
       
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        bf.close();
       
        String[] array
            = listOfStrings.toArray(new String[0]);

        for (int i = 1; i < array.length; i++) {
            String temp = array[i];
            if (temp.contains("INFO")) {
                System.out.println(array[i - 1]);
                System.out.println(array[i]);
                }
            }

        // for (String str : array) {
        //     System.out.println(str); печать всего массива
        // }
    }
    
}
