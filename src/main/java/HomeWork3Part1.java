import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork3Part1 {
    public static void main(String[] args) {
        ArrayList <String> massiv=new ArrayList<>();
        massiv.add("Строка 1");
        massiv.add("Строка 2");
        massiv.add("Строка 3");
        massiv.add("Строка 4");
        massiv.add("Строка 5");
        massiv.add("Строка 6");
        massiv.add("Строка 7");
        massiv.add("Строка 8");
        massiv.add("Строка 9");
        massiv.add("Строка 12");
        massiv.add("Строка 12");
        massiv.add("Строка 12");
        massiv.add("Строка 10");
        massiv.add("Строка 11");
        massiv.add("Строка 12");
        massiv.add("Строка 12");
        massiv.add("Строка 13");
        massiv.add("Строка 14");
        massiv.add("Строка 15");
        massiv.add("Строка 16");
        massiv.add("Строка 16");
        int countRepeatString;
        for (int i=0;i<massiv.size();i++){
            countRepeatString=1;
            String str1=massiv.get(i);
            int index=0;
            Iterator <String> iter=massiv.iterator();
            while (iter.hasNext()){
                String str2= iter.next();
                if (str1.equals(str2) && index!=i){
                    countRepeatString++;
                }
                index++;
            }
            if (countRepeatString==1){
                System.out.println(str1);
            }
        }
        System.out.println();
        for (int i=0;i<massiv.size();i++){
            countRepeatString=1;
            String str1=massiv.get(i);
            int index=0;
            Iterator <String> iter=massiv.iterator();
            while (iter.hasNext()){
                String str2= iter.next();
                //System.out.println(str2);
                if (str1.equals(str2) && index!=i){
                    countRepeatString++;
                    iter.remove();
                }
                index++;
            }
            System.out.println(str1 + " встречается " + countRepeatString + " раз(а)" );

        }

    }
}
