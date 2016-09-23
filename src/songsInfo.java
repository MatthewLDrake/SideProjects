import java.util.Scanner;
public class songsInfo
{
    int potOneAppeal,potTwoAppeal, potThreeAppeal, potFourAppeal, potFiveAppeal, wlAppeal, genreNum, gender;
    String[] genre;
    Scanner kb;
    public songsInfo(int potOne, int potTwo, int potThree,int potFour,int potFive, int genreNumber, int genderNum)
    {
        potOneAppeal = potOne;
        potTwoAppeal = potTwo;
        potThreeAppeal = potThree;
        potFourAppeal = potFour;
        potFiveAppeal = potFive;
        wlAppeal = (int) Math.round(.05*potOne + .15*potTwo + .35*potThree + .25*potFour + .2*potFive);  
        genreNum = genreNumber;
        gender = genderNum;
        kb = new Scanner(System.in);
        genre = new String[]{"Dance", "Mid Tempo Pop", "Pop Ballad", "Power Ballad", "Rock", "Alternative", "Up Tempo Pop", "Schlager", "Slut Pop", "Electronica", "Piano Ballad", "Ethnic Ballad", "Ethnic Pop"};
    }
    public int getPotOneAppeal()
    {
        return potOneAppeal;
    }
    public int getPotTwoAppeal()
    {
        return potTwoAppeal;
    }
    public int getPotThreeAppeal()
    {
        return potThreeAppeal;
    }
    public int getPotFourAppeal()
    {
        return potFourAppeal;
    }
    public int getPotFiveAppeal()
    {
        return potFiveAppeal;
    }
    public int getWLAppeal()
    {
	return wlAppeal;
    }
    
    public void changePotOneAppeal(int num)
    {
        potOneAppeal = num+potOneAppeal;
    }
    public void changePotTwoAppeal(int num)
    {
        potTwoAppeal = num+potTwoAppeal;
    }
    public void changePotThreeAppeal(int num)
    {
        potThreeAppeal = num+potThreeAppeal;
    }
    public void changePotFourAppeal(int num)
    {
        potFourAppeal = num+potFourAppeal;
    }
    public void changePotFiveAppeal(int num)
    {
        potFiveAppeal = num+potFiveAppeal;
    }
    
    public String getGenre()
    {
        return genre[genreNum];
    }
    public String getGender()
    {
        if(gender == 0)return "Male Duet";
        else if(gender == 1)return "Female Duet";
        else if (gender == 2 || gender == 3 || gender == 4)return "Mixed Duet";
        else if (gender >= 5 && gender <= 25)return "Female";
        else return "Male";
    }
    public void update(int loc)
    {
        if(loc == 1)potOneAppeal = potOneAppeal + (int)Math.round(.5*potOneAppeal);
        else if(loc == 2)potTwoAppeal = potTwoAppeal +(int)Math.round(.5*potTwoAppeal);
        else if(loc == 3)potThreeAppeal = potThreeAppeal +(int)Math.round(.5*potThreeAppeal);
        else if(loc == 4)potFourAppeal = potFourAppeal +(int)Math.round(.5*potFourAppeal);
        else if(loc == 5)potFiveAppeal = potFiveAppeal +(int)Math.round(.5*potFiveAppeal);
        
        
        if(loc != 1)potOneAppeal = potOneAppeal -(int)Math.round(.1*potOneAppeal);
        else if(loc != 2)potTwoAppeal = potTwoAppeal -(int)Math.round(.1*potTwoAppeal);
        else if(loc != 3)potThreeAppeal = potThreeAppeal -(int)Math.round(.1*potThreeAppeal);
        else if(loc != 4)potFourAppeal = potFourAppeal -(int)Math.round(.1*potFourAppeal);
        else if(loc != 5)potFiveAppeal = potFiveAppeal -(int)Math.round(.1*potFiveAppeal);        
        
        
    }
    
    
}