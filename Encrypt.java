
import java.util.Scanner;
public class Encrypt{
    public static void main(String[] args) {
        int key=1;
        Scanner o= new Scanner (System.in);
        String Value=o.nextLine();
        String stre="";
        char[] charArray = Value.toCharArray();
        for (int i=0; i<Value.length();i++){
            charArray[i]+=key;
            stre+=charArray[i];
        }
        System.err.println(stre);
        stre="";
        for (int i=0; i<Value.length();i++){
            charArray[i]+=-key;
            stre+=charArray[i];
        }
        System.err.println(stre);
    }
}