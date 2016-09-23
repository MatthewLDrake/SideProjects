import java.util.Random;
import java.util.ArrayList;
public class aiSelectEntry
{
    int numEntries;
    ArrayList<songsInfo> songs;
    public aiSelectEntry(int num)
    {
        numEntries = num;
        
        songs = new ArrayList<songsInfo>();
        for(int i = 0;i<numEntries;i++)
        {
            Random r = new Random();
            songs.add(new songsInfo(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(13),r.nextInt(35)));
        }
    }
    public songsInfo createNationalFinal(int loc)
    {
        Random r = new Random();
        int numSongs = r.nextInt(6)+6;
        if(numSongs > numEntries)numSongs = numEntries;
        songsInfo[] songsForNF = new songsInfo[numSongs];
        for(int i = 0; i< numSongs;i++)
        {
            if(songs.size() != 0)
            {
                int temp = r.nextInt(songs.size());
                songsForNF[i] = songs.get(temp);
                songs.remove(temp);
            }
            else
            {
                //songsForNF[i] = songs.get(0);
                songsInfo[] tempSongs = new songsInfo[i];
                for(int j = 0; j< tempSongs.length; j++)
                {
                    tempSongs[j] = songsForNF[j];
                }
                songsForNF = new songsInfo[i+1];
                for(int j = 0; j< tempSongs.length; j++)
                {
                    songsForNF[j] = tempSongs[j];
                }
                break;
            }
            
        }      
        
        
        aiDoNF national = new aiDoNF(songsForNF,loc);
        
        return national.getWinner();
        
    }
    public songsInfo internallySelect()
    {        
        Random r = new Random();
        int selection = r.nextInt(numEntries);
        return songs.get(selection);
    }
}