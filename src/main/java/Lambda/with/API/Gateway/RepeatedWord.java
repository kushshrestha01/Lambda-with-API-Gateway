package Lambda.with.API.Gateway;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedWord {

    public String firstRepeatedWord(String input) {
        HashMap<String, Integer> stringMap = new HashMap<String, Integer>();
        String[] words = input.split("\\s+");

        for(String s: words) {
            s=s.replaceAll("[-+.^:,]","");
            s=s.toLowerCase();
            if(stringMap.containsKey(s)){
                stringMap.put(s,stringMap.get(s)+1);
            } else {
                stringMap.put(s,1);
            }
        }

        for(String s: words) {
            s=s.replaceAll("[-+.^:,]","");
            s=s.toLowerCase();
            if(stringMap.get(s) > 1) {
                return "first repeated word: " + s;
            }
        }
        return "nothing is repeated";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.next();
        input += sc.nextLine();
//        firstRepeatedWord(input);
    }
}
