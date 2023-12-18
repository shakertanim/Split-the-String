import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ArrayList<String> s2 = new ArrayList<>();
        // Write your code here.
        scan.close();

        String reg = "[ !,?._'@]+";

        String[] splitedString = s.split(reg);

        int l=splitedString.length;
        //System.out.println(splitedString.length);
        for (String str : splitedString) {
            if (str.isBlank()){
                l-=1;
            }
            else {
                s2.add(str);
            }
        }
        System.out.println(l);
        for (String str : s2) {
            System.out.println(str);
        }
    }
}

