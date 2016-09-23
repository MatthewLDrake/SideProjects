import java.util.Scanner;
import java.util.Random;

public class select
{
    entryInfo[] contestInfo;
    Scanner kb;
    int NUM_OF_COUNTRIES;
    public select(entryInfo[] info)
    {
        contestInfo = info;
        NUM_OF_COUNTRIES = info.length;
        kb = new Scanner(System.in);
        initialize();
        
    }
    public void initialize()
    {
        String[] time = new String[]{"early","middle","late"};
        for(int i = 0;i<NUM_OF_COUNTRIES;i++)
        {
            if(contestInfo[i].getPlayer() == -1)
            {
                Random r = new Random();
                int randomInt = r.nextInt(100) + 1;
                if(randomInt >39)contestInfo[i].setNationalFinal(true);                 
                else contestInfo[i].setNationalFinal(false);  
                
                Random r1 = new Random();
                int otherRandomInt = r1.nextInt(100) + 1;
                if(otherRandomInt < 11)contestInfo[i].setSelectionDate(1); 
                else if(otherRandomInt < 46)contestInfo[i].setSelectionDate(2);
                else contestInfo[i].setSelectionDate(3);
            }
            else
            {                
                System.out.println("When would player " + contestInfo[i].getPlayer() + " like to select their entry? Enter a 1 for early in the month, 2 for mid part of the month, and 3 for late in the month");
                int otherInt = kb.nextInt();
                contestInfo[i].setSelectionDate(otherInt);
                
                System.out.println("Would player " + contestInfo[i].getPlayer() + " like to have a national final? Enter a yes or no.");
                String temp = kb.next();
                if(temp.equals("yes"))contestInfo[i].setNationalFinal(true);  
                else if(temp.equals("no"))contestInfo[i].setNationalFinal(false);  
                
            }
            if(contestInfo[i].getNationalFinal())System.out.println(contestInfo[i].getCountryName()+ " will choose their entry via national final in " + time[contestInfo[i].getSelectionDate()-1] + " part of the month");
            else System.out.println(contestInfo[i].getCountryName()+ " will choose their entry via interal selection in " + time[contestInfo[i].getSelectionDate()-1] + " part of the month");
        }
    }
}