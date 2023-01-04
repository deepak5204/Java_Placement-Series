package String;
import java.util.*;

public class ContainString {
    public static String isContain(String a, String b, String pstr){
        String res = a+ b;
        if(res.length() == pstr.length()){
            char [] cha = res.toCharArray();
            char [] chb = pstr.toCharArray();
            Arrays.sort(cha);
            Arrays.sort(chb);
            if(Arrays.equals(cha, chb)){
                return "Yes";
            }
        }  
        return "No";
    }
    public static void main(String[] args){
        String a = "HELLO";
        String b = "SHREY";
        String pstr = "HLOHEELSRY";
        String ans = isContain(a, b, pstr);
        System.out.println(ans);

    }
}
