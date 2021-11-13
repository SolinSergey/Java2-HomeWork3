import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeWork3Part2 {
    public static void main (String args[]) {
        ArrayList <PhoneBook> phonebook = new ArrayList<>();
        add(phonebook,"Иванов", "9101002030");
        add(phonebook,"Петров", "9203004050");
        add(phonebook,"Сидоров", "9304005060");
        add(phonebook,"Князев", "9405006070");
        add(phonebook,"Романов", "9506007080");
        for (int i=0;i< phonebook.size();i++){
            String s1=phonebook.get(i).family;
            String s2=phonebook.get(i).number;
            System.out.println(s1 + s2);
        }

    }

    public static void add(ArrayList ar, String family, String phone){
        PhoneBook record = new PhoneBook(family, phone);
        ar.add(record);
    }

}
