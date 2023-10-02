package JavaTutorial;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String args[]){

        ArrayList<String> emails = new ArrayList<String>();

        emails.add("Shiwani@gmail.com");
        emails.add("shiwani@yahoo.com");
        emails.add("shiwani.kumari@domain.com");
        emails.add("shivi#@domain.co.in");
        emails.add("jsdjhnm@domain.com");

        //Add invalid emails in list
        emails.add("@yahoo.com");
        emails.add("shivu#domain.com");

        //Regular Expression
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
