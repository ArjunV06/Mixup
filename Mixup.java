//Arjun Vasudevan
import java.util.*;

public class Mixup{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string --> ");
        String word = in.next();
        String out = word.substring(word.length()/2);
        String put = word.substring(0,word.length()/2);
        System.out.println(out+put);
    }
}