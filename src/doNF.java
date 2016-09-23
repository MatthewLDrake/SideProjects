import java.util.Scanner;
import java.util.Random;
public class doNF
{
    songsInfo[] songList;
    int location, numSongs;
    int[] teleVotes, entries, voterList;
    Scanner kb;
    int votingSystem;

    public doNF(songsInfo[] songs, int loc)
    {
	kb = new Scanner(System.in);
	
	numSongs = songs.length;
	songList = songs;
	location = loc;
	entries = new int[songs.length];
	teleVotes = new int[songs.length];
	
	Random r = new Random();
	voterList = new int[r.nextInt(7)+4];
	
	
	teleVote(loc);
	for(int i = 0; i<voterList.length;i++)
	{
	    voterList[i] = r.nextInt(5)+1;
	    teleVote(voterList[i]);
	}
	System.out.println("There were " + voterList.length + " voters in your National Final. Here were the results: ");
	
	for(int i = 0; i<songList.length;i++)
	{
	    System.out.println("Song #" + (i+1) + " received " + entries[i] + " points.");
	}
	
	

    }

    public void teleVote(int location)
    {
	int[] teleScores = new int[songList.length];
	for(int i = 0; i<songList.length;i++)
	{            
	    teleScores[i] = teleVote(songList[i],location);            
	}
	givePoints(teleScores);
    }
    private int teleVote(songsInfo song, int location)
    {
	int temp = 0;
	if(location == 1)temp = song.getPotOneAppeal();
	else if(location == 2)temp = song.getPotTwoAppeal();
	else if(location == 3)temp = song.getPotThreeAppeal();
	else if(location == 4)temp = song.getPotFourAppeal();
	else if(location == 5)temp = song.getPotFiveAppeal();    




	Random r = new Random();
	int temp2 = (int)Math.round((temp*1000)/(r.nextDouble()));

	return temp2;
    }

    public void givePoints(int[] d)
    {
	int tempFirst = 0, tempSecond = 0, tempThird = 0, tempFourth = 0, tempFifth = 0, tempSixth = 0, tempSeventh = 0, tempEighth = 0, tempNinth = 0, tempTenth = 0;
	int[] holder = new int[10];

	for(int i = 0; i <d.length;i++)            
	{
	    if(tempFirst < d[i])
	    {
		tempTenth = tempNinth;
		tempNinth = tempEighth;
		tempEighth = tempSeventh;
		tempSeventh = tempSixth;
		tempSixth = tempFifth;
		tempFifth= tempFourth;
		tempFourth = tempThird;
		tempThird = tempSecond;
		tempSecond = tempFirst;
		tempFirst = d[i];

		holder[9] = holder[8];
		holder[8] = holder[7];
		holder[7] = holder[6];
		holder[6] = holder[5];
		holder[5] = holder[4];
		holder[4]= holder[3];
		holder[3] = holder[2];
		holder[2] = holder[1];
		holder[1] = holder[0];
		holder[0] = i;

	    }
	    else
	    {
		if(tempSecond < d[i])
		{
		    tempTenth = tempNinth;
		    tempNinth = tempEighth;
		    tempEighth = tempSeventh;
		    tempSeventh = tempSixth;
		    tempSixth = tempFifth;
		    tempFifth= tempFourth;
		    tempFourth = tempThird;
		    tempThird = tempSecond;
		    tempSecond = d[i];

		    holder[9] = holder[8];
		    holder[8] = holder[7];
		    holder[7] = holder[6];
		    holder[6] = holder[5];
		    holder[5] = holder[4];
		    holder[4]= holder[3];
		    holder[3] = holder[2];
		    holder[2] = holder[1];
		    holder[1] = i;

		}
		else
		{
		    if(tempThird < d[i])
		    {
			tempTenth = tempNinth;
			tempNinth = tempEighth;
			tempEighth = tempSeventh;
			tempSeventh = tempSixth;
			tempSixth = tempFifth;
			tempFifth= tempFourth;
			tempFourth = tempThird;
			tempThird = d[i];

			holder[9] = holder[8];
			holder[8] = holder[7];
			holder[7] = holder[6];
			holder[6] = holder[5];
			holder[5] = holder[4];
			holder[4]= holder[3];
			holder[3] = holder[2];
			holder[2] = i;

		    }
		    else
		    {
			if(tempFourth < d[i])
			{
			    tempTenth = tempNinth;
			    tempNinth = tempEighth;
			    tempEighth = tempSeventh;
			    tempSeventh = tempSixth;
			    tempSixth = tempFifth;
			    tempFifth= tempFourth;
			    tempFourth = d[i];

			    holder[9] = holder[8];
			    holder[8] = holder[7];
			    holder[7] = holder[6];
			    holder[6] = holder[5];
			    holder[5] = holder[4];
			    holder[4]= holder[3];
			    holder[3] = i;

			}
			else
			{
			    if(tempSixth < d[i])
			    {
				tempTenth = tempNinth;
				tempNinth = tempEighth;
				tempEighth = tempSeventh;
				tempSeventh = tempSixth;
				tempSixth = tempFifth;
				tempFifth= d[i];

				holder[9] = holder[8];
				holder[8] = holder[7];
				holder[7] = holder[6];
				holder[6] = holder[5];
				holder[5] = holder[4];
				holder[4]= i;

			    }
			    else
			    {
				if(tempSixth < d[i])
				{
				    tempTenth = tempNinth;
				    tempNinth = tempEighth;
				    tempEighth = tempSeventh;
				    tempSeventh = tempSixth;
				    tempSixth = d[i];

				    holder[9] = holder[8];
				    holder[8] = holder[7];
				    holder[7] = holder[6];
				    holder[6] = holder[5];
				    holder[5] = i;

				}
				else
				{
				    if(tempSeventh < d[i])
				    {
					tempTenth = tempNinth;
					tempNinth = tempEighth;
					tempEighth = tempSeventh;
					tempSeventh = d[i];

					holder[9] = holder[8];
					holder[8] = holder[7];
					holder[7] = holder[6];
					holder[6] = i;

				    }
				    else
				    {
					if(tempEighth < d[i])
					{
					    tempTenth = tempNinth;
					    tempNinth = tempEighth;
					    tempEighth = d[i];

					    holder[9] = holder[8];
					    holder[8] = holder[7];
					    holder[7] = i;

					}
					else
					{
					    if(tempNinth < d[i])
					    {
						tempTenth = tempNinth;
						tempNinth = d[i];

						holder[9] = holder[8];
						holder[8] = i;

					    }
					    else
					    {
						if(tempTenth < d[i])
						{
						    tempTenth = d[i];

						    holder[9] = i;

						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}

	for(int i = 0; i < numSongs; i++)
	{
	    if(holder[0] == i)entries[i] += 12;
	    else if(holder[1] == i)entries[i] += 10;
	    else if(holder[2] == i)entries[i] += 8;
	    else if(holder[3] == i)entries[i] += 7;
	    else if(holder[4] == i)entries[i] += 6;
	    else if(holder[5] == i)entries[i] += 5;
	    else if(holder[6] == i)entries[i] += 4;
	    else if(holder[7] == i)entries[i] += 3;
	    else if(holder[8] == i)entries[i] += 2;
	    else if(holder[9] == i)entries[i] += 1;

	}




    }
    public songsInfo getWinner()
    {        
	int highestScore = 0;
	int holder = 0;
	for(int i = 0;i<entries.length;i++)
	{                
	    if(entries[i] > highestScore)
	    {
		highestScore = entries[i];
		holder = i;
	    }


	}
	return songList[holder];


    }

}