import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String surname, String number) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, new ArrayList<>());
        }
        phonebook.get(surname).add(number);
    }
    public ArrayList<String> get(String surname) {
        //тут неплохо было бы сделать проверку на наличие переданной фамилии в map,
        //но вы просили лишний функционал не добавлять, поэтому я не стал этого делать xD
        return phonebook.get(surname);
    }
}
