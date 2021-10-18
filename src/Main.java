import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1: ");
        String[] array = {"word8","word2","word3","word4","word5","word5","word6","word7","word8","word1","word8","word9"};
        Set<String> unique = new HashSet<String>();
        Collections.addAll(unique,array);
        for (String s : unique) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (s.equals(array[i])) sum++;
            }
            System.out.println(s + " - " + sum);
        }

        System.out.println("---------------------------");
        System.out.println("Task2: ");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Surname1", "1-123-456-78-90");
        phonebook.add("Surname2", "2-234-467-67-67");
        phonebook.add("Surname3", "5-145-686-56-55");
        phonebook.add("Surname2", "7-456-244-51-98");
        System.out.println(phonebook.get("Surname2"));
    }
}
