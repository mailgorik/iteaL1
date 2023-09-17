package Class7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
        2. Написати метод, який перевіряє валідність українського номера повного формату (+380442221111(9)) +380545352266(9) +380668968686
 */
public class uNumber {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("+380442221111");
        numbers.add("+3804442221111");
        numbers.add("+38096985543");
        numbers.add("+38506258638");
        numbers.add("+791205273553");

        String regex = "^\\+380\\d{9}$";

        Pattern pattern = Pattern.compile(regex);

        for (String number: numbers){
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + " : " + matcher.matches());
        }
    }
}
