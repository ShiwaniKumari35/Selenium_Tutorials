package JavaTutorial;

public class LeapYearOrNot {
    public static void main(String  [] args){
        int year = 2000;
        boolean leap = false;

        // if the year is divided by 4
        if(year % 4 == 0){

            // if the year is century
            if(year % 100 == 0){

                // if year is divided by 400
                // then it is a leap yea
                if(year % 400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            // if the year is not century
            else {
                leap = true;
            }
        }
        else{
            leap = false;
        }
        if(leap){
            System.out.println( year + " is a leap is year");
        }
        else {
            System.out.println( year + " is not a leap year");
        }
    }
}
