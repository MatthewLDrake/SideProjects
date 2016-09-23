import java.util.Scanner;
import java.util.Random;
public class selectEntry
{
    int numEntries;
    Scanner kb;
    songsInfo[] songs;
    public selectEntry(int num)
    {
        numEntries = num;
        kb = new Scanner(System.in);
        
        songs = new songsInfo[numEntries];
        for(int i = 0;i<numEntries;i++)
        {
            Random r = new Random();
            songs[i] = new songsInfo(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(13),r.nextInt(35));
        }
        
        
    }
    public songsInfo createNationalFinal(int loc)
    {
        System.out.println("How many entries would you like to have in your national final? Artists have submitted " + numEntries + " songs");
        int numSongs = kb.nextInt();
        for(int i = 0;i<numEntries;i++)
        {
            System.out.println("Song Number " + (i+1) + " is a(n) " + songs[i].getGenre() + " song and it is sung by a " + songs[i].getGender());
        }
        System.out.println("Which songs would you like to choose? ");
        songsInfo[] songsForNF = new songsInfo[numSongs];
        for(int i = 0; i< numSongs;i++)
        {
            songsForNF[i] = songs[kb.nextInt()-1];
        }
        doNF national = new doNF(songsForNF,loc);
        
        return national.getWinner();
    }
    public songsInfo internallySelect()
    {
        System.out.println("Would you like to select from a bunch of songs sent by composers or would you like to customly compose your entry? Pick 1 or 2 respectively.");
        int temp = kb.nextInt();
        if(temp == 1)
        {
            for(int i = 0;i<numEntries;i++)
            {
                System.out.println("Song Number " + (i+1) + " is a(n) " + songs[i].getGenre() + " song and it is sung by a " + songs[i].getGender());
            }
            System.out.println("Which song would you like to choose? ");
            int selection = kb.nextInt();
            return songs[selection-1];
        }
        else if(temp == 2)
        {
            System.out.println("Would you like to use a foreign composer, or hire a local composer");
            kb.nextLine();
            
            System.out.println("What genre would you like to make the song? (1: Dance 2: Mid Tempo Pop 3: Pop Ballad " + 
                               "4: Power Ballad 5: Rock 6: Alternative 7: Up Tempo Pop 8: Schlager 9: Slut Pop " +
                               "10: Electronica 11: Piano Ballad 12: Ethnic Ballad 13: Ethnic Pop");
            int temp2 = Integer.parseInt(kb.nextLine())-1;
            System.out.println("Would you like a Male Duet (1), Female Duet (2), Mixed Duet (3), Female (4), or Male (5) to sing your song?");
            int temp3 = Integer.parseInt(kb.nextLine());
            if(temp3 > 3) temp3 = temp3+22;
            
            System.out.println("Would you like to try to develop an even entry (1), or would you like to focus on a specific appeal(2)? ");
            int temp4 = Integer.parseInt(kb.nextLine());
            Random r = new Random();
            if(temp4 == 1)return new songsInfo(r.nextInt(80)+20,r.nextInt(80)+20,r.nextInt(80)+20,r.nextInt(80)+20,r.nextInt(80)+20,temp2,temp3);  
            else
            {
                System.out.println("Which Pot would you like your song to be focused on?");
                int temp5 = Integer.parseInt(kb.nextLine());
                
                if(temp5 == 1)return new songsInfo(r.nextInt(50)+60,r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),temp2,temp3);
                else if(temp5 == 2)return new songsInfo(r.nextInt(100),r.nextInt(50)+60,r.nextInt(100),r.nextInt(100),r.nextInt(100),temp2,temp3);
                else if(temp5 == 3)return new songsInfo(r.nextInt(100),r.nextInt(100),r.nextInt(50)+60,r.nextInt(100),r.nextInt(100),temp2,temp3);
                else if(temp5 == 4)return new songsInfo(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(50)+60,r.nextInt(100),temp2,temp3);
                else return new songsInfo(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(50)+60,temp2,temp3);

            }
            
            
        }
        else return null;
    }
}