import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
public class printInformation
{
    entryInfo[] contestInfo;
    String[] voterList;
    StringBuilder votingList;
    StringBuilder[] participantInfo;
    holdJuryPoints[] hold;
    public printInformation(entryInfo[] c, entryInfo[] n, holdJuryPoints[] h, int numParticipants)
    {
        voterList = new String[numParticipants+1];
        votingList = new StringBuilder();
        participantInfo = new StringBuilder[c.length];
        contestInfo = c;
        hold = h;
        for(int i = 0; i <c.length;i++)
        {
            voterList[i] = c[i].getCountryName();
        }
        for(int i = c.length; i < n.length+c.length;i++)
        {
            voterList[i] = n[i-c.length].getCountryName();
        }
        voterList[numParticipants] = "Waiting List";
        votingList.append("0, User, Country, Artist, Song, Total");
        for(int i = 0; i<voterList.length;i++)
        {
            votingList.append("," + voterList[i]); 
        }
        //System.out.println(votingList.toString());
        for(int  i = 0; i < participantInfo.length;i++)
        {
            participantInfo[i] = new StringBuilder();
            participantInfo[i].append((i+1) + "," + c[i].getCountryName() + "," + c[i].getAltCountryName() + ", " + c[i].getArtistName() + ", " + c[i].getSongName() + ", " + c[i].getFinalPoints());
            
            for(int j=0; j < hold.length;j++)
            {
                if(i == hold[j].getFirst())participantInfo[i].append(", 12");
                else if(i == hold[j].getSecond())participantInfo[i].append(", 10");
                else if(i == hold[j].getThird())participantInfo[i].append(", 8");
                else if(i == hold[j].getFourth())participantInfo[i].append(", 7");
                else if(i == hold[j].getFifth())participantInfo[i].append(", 6");
                else if(i == hold[j].getSixth())participantInfo[i].append(", 5");
                else if(i == hold[j].getSeventh())participantInfo[i].append(", 4");
                else if(i == hold[j].getEighth())participantInfo[i].append(", 3");
                else if(i == hold[j].getNinth())participantInfo[i].append(", 2");
                else if(i == hold[j].getTenth())participantInfo[i].append(", 1");
                else participantInfo[i].append(",");
            }
            //participantInfo[i].append(", " + contestInfo[i].getFinalTelevote());
            //System.out.println(participantInfo[i].toString());
        }
        print();
        
    }
    public printInformation(entryInfo[] c, holdJuryPoints[] h, int numParticipants)
    {
	voterList = new String[numParticipants];
        votingList = new StringBuilder();
        participantInfo = new StringBuilder[c.length];
        contestInfo = c;
        hold = h;
        for(int i = 0; i <c.length;i++)
        {
            voterList[i] = c[i].getCountryName();
        }
        votingList.append("0, User, Country, Artist, Song, Total");
        for(int i = 0; i<voterList.length;i++)
        {
            votingList.append("," + voterList[i]); 
        }
        //System.out.println(votingList.toString());
        for(int  i = 0; i < participantInfo.length;i++)
        {
            participantInfo[i] = new StringBuilder();
            participantInfo[i].append((i+1) + "," + c[i].getCountryName() + "," + c[i].getAltCountryName() + ", " + c[i].getArtistName() + ", " + c[i].getSongName() + ", " + c[i].getFinalPoints());
            
            for(int j=0; j < hold.length;j++)
            {
                if(i == hold[j].getFirst())participantInfo[i].append(", 12");
                else if(i == hold[j].getSecond())participantInfo[i].append(", 10");
                else if(i == hold[j].getThird())participantInfo[i].append(", 8");
                else if(i == hold[j].getFourth())participantInfo[i].append(", 7");
                else if(i == hold[j].getFifth())participantInfo[i].append(", 6");
                else if(i == hold[j].getSixth())participantInfo[i].append(", 5");
                else if(i == hold[j].getSeventh())participantInfo[i].append(", 4");
                else if(i == hold[j].getEighth())participantInfo[i].append(", 3");
                else if(i == hold[j].getNinth())participantInfo[i].append(", 2");
                else if(i == hold[j].getTenth())participantInfo[i].append(", 1");
                else participantInfo[i].append(",");
            }
            //participantInfo[i].append(", " + contestInfo[i].getFinalTelevote());
            //System.out.println(participantInfo[i].toString());
        }
        print();
    }
    public void print()
    {
        try
        {
            
            PrintWriter writer = new PrintWriter("Eurovision Simulator.csv", "UTF-8");
            writer.println(votingList);
            for(int i = 0; i<participantInfo.length;i++)
            {
                writer.println(participantInfo[i].toString());
            }
            
            writer.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
    public void printSemiInfo(entryInfo[] semiOne, entryInfo[] semiTwo)
    {
        try
        {
            PrintWriter writer = new PrintWriter("Semi Final Results.txt", "UTF-8");
            writer.println("Semi Final One Results: ");
            int[] semiOnePlaces = findPlaces(semiOne, false);
            
            for(int i = 0; i<semiOne.length;i++)
            {
                writer.println(semiOnePlaces[i] + ". " + semiOne[i].getCountryName() + " - " + semiOne[i].getArtistName()  + 
                               " - " + semiOne[i].getSongName() + " " + semiOne[i].getSemiScore() + " points");
            }
            
            int[] semiTwoPlaces = findPlaces(semiTwo, false);
            writer.println("\nSemi Final Two Results: ");
            for(int i = 0; i<semiTwo.length;i++)
            {
                writer.println(semiTwoPlaces[i] + ". " + semiTwo[i].getCountryName() + " - " + semiTwo[i].getArtistName()  + 
                               " - " + semiTwo[i].getSongName() + " " + semiTwo[i].getSemiScore() + " points");
            }
            
            int[] semiOneIJPlaces = findPlaces(semiOne, true);
            writer.println("\nSemi Final One IJ Results: ");
            for(int i = 0; i<semiOne.length;i++)
            {
                writer.println(semiOneIJPlaces[i] + ". " + semiOne[i].getCountryName() + " - " + semiOne[i].getArtistName()  + 
                               " - " + semiOne[i].getSongName() + " " + semiOne[i].getSemiIJScore() + " points");
            }
            
            int[] semiTwoIJPlaces = findPlaces(semiTwo, true);
            writer.println("\nSemi Final Two IJ Results: ");
            for(int i = 0; i<semiTwo.length;i++)
            {
                writer.println(semiTwoIJPlaces[i] + ". " + semiTwo[i].getCountryName() + " - " + semiTwo[i].getArtistName()  + 
                               " - " + semiTwo[i].getSongName() + " " + semiTwo[i].getSemiIJScore() + " points");
            }
            writer.close();
        }
         catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
    public void printEntryInfo(entryInfo[] info)
    {
	try
	{
	    PrintWriter writer = new PrintWriter("Entry Information.txt", "UTF-8");
	    writer.println("Entries For This Edition of Internatia Song Contest" +
	    "/n_____________________________________________");
	    for(int i = 0; i<info.length;i++)
	    {
		writer.println(info[i].getCountryName() + "'s entry: "+ info[i].getArtistName()  + 
                        " - " + info[i].getSongName() + ", had " + info[i].getSongInfo().getPotOneAppeal() + " pot 1 appeal, " + info[i].getSongInfo().getPotTwoAppeal() + " pot 2 appeal, " +
			info[i].getSongInfo().getPotThreeAppeal() + " pot 3 appeal, " + info[i].getSongInfo().getPotFourAppeal() + " pot 4 appeal, "+ info[i].getSongInfo().getPotFiveAppeal() + " pot 5 appeal, ");
	    }
	    //writer.println(info);
	    writer.close();
	}
	catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
    private int[] findPlaces(entryInfo[] semi, boolean IJ)
    {
        int[] returnVal = new int[semi.length];
        for(int i = 0; i < semi.length; i++)
        {
            int temp = 1;
            for( int j = 0; j < semi.length; j++)
            {
                if(!IJ && (semi[i].getSemiScore() < semi[j].getSemiScore() || (semi[i].getSemiScore() == semi[j].getSemiScore() && i > j)))
                {
                    temp++;
                }
                else if(IJ && (semi[i].getSemiIJScore() < semi[j].getSemiIJScore() || (semi[i].getSemiIJScore() == semi[j].getSemiIJScore() && i > j)))
                {
                    temp++;
                }
            }
            returnVal[i] = temp;
        }
        return returnVal;
    }
}