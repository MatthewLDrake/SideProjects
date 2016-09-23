import java.util.Scanner;
import java.util.Random;
public class beginning
{
    int NUM_OF_PLAYERS, NUM_OF_COUNTRIES;
    Scanner kb;
    int playerCounter;
    entryInfo[] contestInfo;
    public beginning(entryInfo[] info)
    {
        contestInfo = info;
        NUM_OF_COUNTRIES = info.length;
        kb = new Scanner(System.in);
        initialize();
        
    }
    public void initialize()
    {
        System.out.println("How many players will be playing? ");
        
        NUM_OF_PLAYERS = kb.nextInt();
        kb.nextLine();
        
        playerCounter = 1;
        
        while(NUM_OF_PLAYERS != 0)
        {
            System.out.println("Would you like to choose or randomly select your country? Please enter a 1 for choosing, and a 2 for random.");
            int temp = Integer.parseInt(kb.nextLine());
            if(temp == 1)
            {
                String[] value = new String[NUM_OF_PLAYERS];
                for(int i = 0;i<NUM_OF_PLAYERS;i++)
                {
                    
                    System.out.println("Please enter the name of the country that player " + (1+i) + " would like to play as");
                    
                    value[i] = kb.nextLine();
                    
                    
                    
                    
                    for(int j = 0;j<NUM_OF_COUNTRIES;j++)
                    {
                        if(value[i].equals(contestInfo[j].getCountryName()))
                        {
                            if(contestInfo[j].getPlayer() == -1)
                            {
                                //countryControlled[i] = j;
                                contestInfo[j].setPlayer(playerCounter++);
                                break; //perhaps after the else is the proper place to break, never tested it
                            }
                            else
                            {
                                System.out.println("This country has already been selected by someone.");
                                i--;
                            }
                            
                        }                        
                    }
                }
                break;
            }
            else if(temp == 2)
            {
                for(int i = 0;i<NUM_OF_PLAYERS;i++)
                {
                    Random rand = new Random(); 
                    int value = rand.nextInt(55);
                    if(contestInfo[value].getPlayer() == -1)
                    {
                        //String tempStr = contestInfo[value].getCountryName();
                        contestInfo[value].setPlayer(playerCounter++);
                    }
                    else i--;
                    
                }
                break;
            }
            else
            {
                System.out.println("You did not enter a valid number");
            }            
            
        }
        for(int i = 0;i<NUM_OF_COUNTRIES;i++)
        {
            if(contestInfo[i].getPlayer() != -1)
                System.out.println("Player " + contestInfo[i].getPlayer() + " will be the HOD for " + contestInfo[i].getCountryName());
            
            
        }
    }
}