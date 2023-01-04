package String;

public class BinarySum {

    public static String bsum(String a, String b){
        String res = "";
        int c = 0;
        int i = 0;
        

        while(i < a.length() || i < b.length() || c != 0){
            int x = 0;
            if(i < a.length() && a.charAt(a.length()-i-1) == '1'){
                x = 1;
            }

            int y = 0;
            if(i < b.length() && b.charAt(b.length()-i-1) == '1'){
                y = 1;
            }
            int ssum = (x + y + c) % 2;
            res = ssum + res;
            c = (x + y + c) / 2;
            i++;
        }
        return res;
    }
    public static void main(String[] args){
        String a = "11101", b = "1011";
        String res = bsum(a, b);
        System.out.println(res);
    }
}
