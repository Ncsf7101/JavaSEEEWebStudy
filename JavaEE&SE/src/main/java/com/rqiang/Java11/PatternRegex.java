package com.rqiang.Java11;
import java.util.Scanner;
import java.util.regex.Pattern;
public class PatternRegex {
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        String rq = input.nextLine();
        if(Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}").matcher(rq).matches()){
            System.out.println("是日期");
        }else{
            System.out.println("不是日期");
        }
    }

    public static void main(String[] args) {
        String s[] = "A1B22C3333D4444".split("\\d+");
        for (int i = 0; i<s.length; i++) {
            System.out.print(s[i] + "、");
        }
    }
}
