import java.util.HashSet;
import java.util.Set;

public class AppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> temp = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(temp.contains(ch)){
                return ch;
            }
            temp.add(ch);
        }
        return ' ';
    }
}
