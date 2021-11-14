import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork3Part2 {
    public static void main (String args[]) {
        ArrayList <PhoneBook> phonebook = new ArrayList<>();
        add(phonebook,"Иванов", "9101002030");
        add(phonebook,"Петров", "9203004050");
        add(phonebook,"Сидоров", "9304005060");
        add(phonebook,"Князев", "9405006070");
        add(phonebook,"Романов", "9506007080");
        add(phonebook,"Романов", "9506007080");
        add(phonebook,"Сидоров", "9506991122");
        add(phonebook,"Сидоров", "9210607181");
        get(phonebook,"Сидоров");

    }

    public static void add(ArrayList ar, String family, String phone){
        PhoneBook record = new PhoneBook(family, phone);
        ar.add(record);
    }

    public static void get(ArrayList ar, String family){
        Iterator<PhoneBook> iter=ar.iterator();
        while (iter.hasNext()){
            PhoneBook phoneBook = iter.next();
            if (family.equalsIgnoreCase(phoneBook.family)){
                System.out.println(phoneBook.family + " " + phoneBook.number);
            }
        }
    }
}
