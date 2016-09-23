import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class escHodSim
{

    private static int NUM_OF_COUNTRIES, semiOneNumberOfSongs,semiTwoNumberOfSongs, amountOfQualifiers, finalAmount = 27;
    private static entryInfo[] contestInfo, semiFinalOne, semiFinalTwo;
    private static Scanner kb = new Scanner(System.in);
    private static int[] pots = new int[]{11,11,11,11,11};
    private static boolean realEdi, semiFinals = true;
    public static void main(String[] args)
    {        
	System.out.println("Would you like to simulate a real ISC edition, or would you like to simulate a fake edition?");
	String answer = kb.nextLine();
	realEdi = false;
	if(answer.toLowerCase().equals("real"))realEdi = true;

	Random randy = new Random();
	int tempH = 0;

	if(!realEdi)
	{
	    NUM_OF_COUNTRIES = 55;
	    contestInfo = new entryInfo[NUM_OF_COUNTRIES];
	    semiOneNumberOfSongs = 27;
	    semiTwoNumberOfSongs = 27;
	    amountOfQualifiers = 26;
	    createCountries();
	    tempH = randy.nextInt(55);
	}
	else
	{
	    System.out.println("Which edition would you like to simulate? Currently implemented are ISC's 1-2 and 38-48");
	    answer = kb.nextLine();
	    realEditions Real = new realEditions(answer);
	    tempH = Real.getHost();
	    contestInfo = Real.getContestInfo();
	    NUM_OF_COUNTRIES = Real.getAmountCountries();
	    semiOneNumberOfSongs = (NUM_OF_COUNTRIES-1)/2;
	    semiTwoNumberOfSongs = (NUM_OF_COUNTRIES-1)-semiOneNumberOfSongs;
	    if(NUM_OF_COUNTRIES < 29)
		{
			semiFinals = false;
			finalAmount = NUM_OF_COUNTRIES;
		}
	    else if(NUM_OF_COUNTRIES < 36)
		{
			amountOfQualifiers = 20;
		}
	    else if(NUM_OF_COUNTRIES < 42)
		{
			amountOfQualifiers = 22;
		}
	    else if(NUM_OF_COUNTRIES < 48)
		{
			amountOfQualifiers = 24;
		}
	    else 
		{
			amountOfQualifiers = 26;
		}
	}
	if(!semiFinals) semiFinals = false;
	semiFinalOne = new entryInfo[semiOneNumberOfSongs];
	semiFinalTwo = new entryInfo[semiTwoNumberOfSongs];

	System.out.println("The host for this edition is " + contestInfo[tempH].getCountryName());
	pots[contestInfo[tempH].getLocation()-1] = pots[contestInfo[tempH].getLocation()-1]-1;
	contestInfo[tempH].setHost(true);
	new beginning(contestInfo);

	new select(contestInfo);


	for(int i = 0;i<NUM_OF_COUNTRIES;i++)
	{
	    if(contestInfo[i].getSelectionDate() == 1)
	    {
		selectSongs(8,17,i);                
	    }            

	}
	calculateBettingOdds();

	for(int i = 0;i<NUM_OF_COUNTRIES;i++)
	{
	    if(contestInfo[i].getSelectionDate() == 2)
	    {
		selectSongs(12,20,i);                
	    }            

	}
	calculateBettingOdds();
	for(int i = 0;i<NUM_OF_COUNTRIES;i++)
	{
	    if(contestInfo[i].getSelectionDate() == 3)
	    {
		selectSongs(15,20,i);                
	    }


	}
	calculateBettingOdds();
	if(!realEdi)System.out.println("Are you ready to promote your entry? ");
	kb.next();
	
	if(semiFinals)
	{
	    Random randOne = new Random();
	    int semi1Songs = semiOneNumberOfSongs, semi2Songs = semiTwoNumberOfSongs, semi1Voter = randOne.nextInt(8)+8,semi2Voter = randOne.nextInt(8)+8;
	    int[] semi1Pots = new int[]{5,5,5,5,5},semi2Pots = new int[]{5,5,5,5,5};
	    int[] voterOne = new int[semi1Voter], voterTwo = new int[semi2Voter];

	    if(contestInfo[tempH].getLocation()%2 == 0)
	    {
		if(contestInfo[tempH].getLocation() == 2)
		{
		    semi1Pots[0]++;
		    semi2Pots[2]++;
		    semi1Pots[3]++;
		    semi2Pots[4]++;
		}
		else if(contestInfo[tempH].getLocation() == 4)
		{
		    semi1Pots[0]++;
		    semi2Pots[1]++;
		    semi1Pots[2]++;
		    semi2Pots[4]++;
		}
	    }
	    else
	    {
		if(contestInfo[tempH].getLocation() == 1)
		{
		    semi1Pots[1]++;
		    semi2Pots[2]++;
		    semi1Pots[3]++;
		    semi2Pots[4]++;
		}
		else if(contestInfo[tempH].getLocation() == 3)
		{
		    semi1Pots[0]++;
		    semi2Pots[1]++;
		    semi1Pots[3]++;
		    semi2Pots[4]++;
		}
		else
		{
		    semi1Pots[0]++;
		    semi2Pots[1]++;
		    semi1Pots[2]++;
		    semi2Pots[3]++;
		}
	    }

	    entryInfo[] tempSemiFinalOne = new entryInfo[semiOneNumberOfSongs], tempSemiFinalTwo = new entryInfo[semiTwoNumberOfSongs];
	    for(int i = 0; i<NUM_OF_COUNTRIES; i++)
	    {
		contestInfo[i].updateScores();
		Random r = new Random();

		if(!contestInfo[i].getHost())
		{
		    int temp = r.nextInt(2)+1;
		    if(semi1Songs != 0 && ((temp == 1 && semi1Pots[contestInfo[i].getLocation()-1] != 0) || (semi2Songs == 0) || semi2Pots[contestInfo[i].getLocation()-1] == 0))
		    {
			semi1Songs--;
			semi1Pots[contestInfo[i].getLocation()-1]--;
			contestInfo[i].setSemiFinal(1);
			tempSemiFinalOne[(semiOneNumberOfSongs-1) - semi1Songs] = contestInfo[i];
		    }
		    else
		    {
			semi2Songs--;
			semi2Pots[contestInfo[i].getLocation()-1]--;
			contestInfo[i].setSemiFinal(2);
			tempSemiFinalTwo[(semiTwoNumberOfSongs-1) - semi2Songs] = contestInfo[i];
		    }
		}

	    }

	    for(int i = 0; i < voterOne.length;i++)
	    {
		int temp = randOne.nextInt(semiTwoNumberOfSongs);
		voterOne[i] = tempSemiFinalTwo[temp].getLocation();
	    }
	    for(int i = 0; i < voterTwo.length;i++)
	    {
		int temp = randOne.nextInt(semiOneNumberOfSongs);
		voterTwo[i] = tempSemiFinalOne[temp].getLocation();
	    }

	    ArrayList<Integer> semiOneRunningOrder, semiTwoRunningOrder; 
	    semiOneRunningOrder = assignValues(semiOneNumberOfSongs);
	    semiTwoRunningOrder = assignValues(semiTwoNumberOfSongs);

	    Random r = new Random();
	    int counter = 0;
	    for(int placeHolder = semiOneRunningOrder.size(); placeHolder >= 0; placeHolder--)
	    {            
		if(placeHolder != 0)
		{
		    int temp = r.nextInt(placeHolder);
		    semiFinalOne[counter++] = tempSemiFinalOne[semiOneRunningOrder.get(temp)];
		    semiOneRunningOrder.remove(temp);
		}

	    }
	    counter = 0;
	    for(int placeHolder = semiTwoRunningOrder.size(); placeHolder >= 0; placeHolder--)
	    {            
		if(placeHolder != 0)
		{
		    int temp = r.nextInt(placeHolder);
		    semiFinalTwo[counter++] = tempSemiFinalTwo[semiTwoRunningOrder.get(temp)];
		    semiTwoRunningOrder.remove(temp);
		}
	    }

	    printRunningOrder(1,semiFinalOne);
	    printSemiList(1);

	    printRunningOrder(2,semiFinalTwo);
	    printSemiList(2);

	    new semiFinals(semiFinalOne, voterOne);
	    getQualifiers qualifiersOne = new getQualifiers(semiFinalOne, amountOfQualifiers);        


	    entryInfo[] tempFinal = new entryInfo[amountOfQualifiers+1], finalOrder = new entryInfo[amountOfQualifiers+1];
	    entryInfo[] tempQualifiers = qualifiersOne.getTheQualifiers();
	    entryInfo[] nonQualifiers = new entryInfo[(NUM_OF_COUNTRIES-1)-amountOfQualifiers];
	    entryInfo[] tempNon = qualifiersOne.getNonQualifiers();
	    int startingPoint = 0;
	    for(int i =0; i<tempNon.length;i++)
	    {
		nonQualifiers[i] = tempNon[i];
		startingPoint = i+1;
	    }

	    for(int i = 0;i < tempQualifiers.length;i++)
	    {
		tempFinal[i] = tempQualifiers[i];
	    }

	    new semiFinals(semiFinalTwo, voterTwo);
	    getQualifiers qualifiersTwo = new getQualifiers(semiFinalTwo, amountOfQualifiers);  
	    entryInfo[] tempQualifier = qualifiersTwo.getTheQualifiers();
	    tempNon = qualifiersTwo.getNonQualifiers();

	    for(int i = (int)(amountOfQualifiers/2);i < (int)(amountOfQualifiers/2)+tempQualifier.length;i++)
	    {
		tempFinal[i] = tempQualifier[i-(int)(amountOfQualifiers/2)];
	    }
	    for(int i = startingPoint; i<nonQualifiers.length;i++)
	    {
		nonQualifiers[i] = tempNon[i-startingPoint];
	    }


	    tempFinal[amountOfQualifiers] = contestInfo[tempH];

	    ArrayList<Integer> finalRunningOrder; 
	    finalRunningOrder = assignValues(amountOfQualifiers+1);        

	    counter = 0;
	    for(int placeHolder = finalRunningOrder.size(); placeHolder >= 0; placeHolder--)
	    {            
		if(placeHolder != 0)
		{
		    int temp = r.nextInt(placeHolder);
		    finalOrder[counter++] = tempFinal[finalRunningOrder.get(temp)];
		    finalRunningOrder.remove(temp);
		}

	    }
	    printRunningOrder(3,finalOrder);


	    Final doFinal = new Final(finalOrder, nonQualifiers);

	    for(int i = 0; i<finalOrder.length;i++)
	    {
		System.out.println(finalOrder[i].getCountryName() + " receieved " + finalOrder[i].getFinalPoints() + " points.");
	    }

	    printInformation print = new printInformation(finalOrder, nonQualifiers, doFinal.getJuryVotes(),NUM_OF_COUNTRIES);
	    print.printSemiInfo(semiFinalOne, semiFinalTwo);
	    print.printEntryInfo(contestInfo);
	}
	else
	{
	    entryInfo[] finalOrder = new entryInfo[finalAmount];
	    ArrayList<Integer> finalRunningOrder; 
	    finalRunningOrder = assignValues(finalAmount);        
	    Random r = new Random();
	    
	    int counter = 0;
	    for(int placeHolder = finalRunningOrder.size(); placeHolder >= 0; placeHolder--)
	    {            
		if(placeHolder != 0)
		{
		    int temp = r.nextInt(placeHolder);
		    finalOrder[counter++] = contestInfo[finalRunningOrder.get(temp)];
		    
		    finalRunningOrder.remove(temp);
		}

	    }
	    printRunningOrder(3,finalOrder);
	    
	    Final doFinal = new Final(finalOrder);
	    for(int i = 0; i<finalOrder.length;i++)
	    {
		System.out.println(finalOrder[i].getCountryName() + " receieved " + finalOrder[i].getFinalPoints() + " points.");
	    }
	    printInformation print = new printInformation(finalOrder, doFinal.getJuryVotes(),NUM_OF_COUNTRIES);
	    print.printEntryInfo(contestInfo);
	}

    }
    public static void selectSongs(int base, int rand, int i)
    {
	Random r = new Random();
	int numEntries = r.nextInt(rand)+base;


	if(contestInfo[i].getPlayer() != -1)
	{ 
	    selectEntry selection = new selectEntry(numEntries);
	    String temp1 = "";
	    if(!contestInfo[i].getNationalFinal())
	    {
		contestInfo[i].setSongInfo(selection.internallySelect());
		System.out.println("What would you like to call your song? ");    
		temp1 = kb.nextLine();

		contestInfo[i].setSongName(temp1.toString());
	    }
	    else
	    {
		contestInfo[i].setSongInfo(selection.createNationalFinal(contestInfo[i].getLocation()));
		System.out.println("The winning song is a "+ contestInfo[i].getSongInfo().getGenre() + " sung by a " +contestInfo[i].getSongInfo().getGender());
		System.out.println("What would you like to call your song? ");
		temp1 = kb.nextLine();

		contestInfo[i].setSongName(temp1.toString());
	    }                     
	    System.out.println("What is the name of the artist?");
	    String temp2 = kb.nextLine();
	    contestInfo[i].setArtistName(temp2);

	}
	else
	{
	    aiSelectEntry selection = new aiSelectEntry(numEntries);
	    songNameDataBase songName = new songNameDataBase(); 
	    if(!contestInfo[i].getNationalFinal())
	    {
		contestInfo[i].setSongInfo(selection.internallySelect());
		if(!realEdi)
		{
		    String temp1 = songName.getSongName();
		    contestInfo[i].setSongName(temp1.toString());
		}
		  

	    }
	    else
	    {
		contestInfo[i].setSongInfo(selection.createNationalFinal(contestInfo[i].getLocation()));
		if(!realEdi)
		{
		    String temp1 = songName.getSongName();
		    contestInfo[i].setSongName(temp1.toString());
		}
	    }
	    String genre = contestInfo[i].getSongInfo().getGenre();
	    String artist = "";            
	    int temp3= r.nextInt(10);
	    int temp4 = r.nextInt(10);
	    int temp5 = r.nextInt(43)+1;
	    if(!realEdi)
	    {
		if((genre.equals("Rock") ||genre.equals("Alternative")) && temp3 != 5)
		{                
		    artistNameDataBase artistName = new artistNameDataBase(0,1,true);
		    artist = artistName.getName();
		}
		else
		{
		    String gender = contestInfo[i].getSongInfo().getGender();
		    if(gender.equals("Male"))
		    {
			artistNameDataBase artistName;
			if(temp3 > 3)artistName = new artistNameDataBase(temp5,2,true);                   
			else artistName = new artistNameDataBase(temp5,1,true);

			artist = artistName.getName();
		    }
		    else if(gender.equals("Female"))
		    {
			artistNameDataBase artistName;
			if(temp3 > 3)artistName = new artistNameDataBase(temp5,2,false);
			else artistName = new artistNameDataBase(temp5,1,false);

			artist = artistName.getName();
		    }
		    else if(gender.equals("Female Duet"))
		    {
			artistNameDataBase artistName;
			if(temp3 > 5) artistName = new artistNameDataBase(temp5,2,false);
			else  artistName = new artistNameDataBase(temp5,1,false);

			artist = artistName.getName();

			if(temp4 > 5) artistName = new artistNameDataBase(temp5,2,false);
			else  artistName = new artistNameDataBase(temp5,1,false);

			artist = artist + " & " + artistName.getName();
		    }
		    else if(gender.equals("Mixed Duet"))
		    {
			artistNameDataBase artistName;
			if(temp3 > 5) artistName = new artistNameDataBase(temp5,2,true);
			else  artistName = new artistNameDataBase(temp5,1,true);

			artist = artistName.getName();

			if(temp4 > 5) artistName = new artistNameDataBase(temp5,2,false);
			else  artistName = new artistNameDataBase(temp5,1,false);

			artist = artist + " & " + artistName.getName();
		    }
		    else if(gender.equals("Male Duet"))
		    {
			artistNameDataBase artistName;
			if(temp3 > 5) artistName = new artistNameDataBase(temp5,2,true);
			else  artistName = new artistNameDataBase(temp5,1,true);

			artist = artistName.getName();

			if(temp4 > 5) artistName = new artistNameDataBase(temp5,2,true);
			else  artistName = new artistNameDataBase(temp5,1,true);

			artist = artist + " & " + artistName.getName();
		    }
		}
		contestInfo[i].setArtistName(artist);
	    }


	}
	System.out.println(contestInfo[i].getCountryName() + "'s entry is " + contestInfo[i].getSongName() + " sung by " + contestInfo[i].getArtistName());
    }
    public static void printSemiList(int semi)
    {
	System.out.println("These countries were to vote in Semi Final " + semi + ":\n_____________________________________________");
	for(int i = 0;i<contestInfo.length;i++)
	{            
	    if(contestInfo[i].getSemiFinal() == semi+2)System.out.println(contestInfo[i].getCountryName());            
	}        
	System.out.println();
    }
    public static ArrayList<Integer> assignValues(int length)
    {
	ArrayList<Integer> returnVal = new ArrayList<Integer>();
	for(int i = 0; i<length;i++)
	{
	    returnVal.add(i);
	}
	return returnVal;
    }
    public static void printRunningOrder(int semi, entryInfo[] songs)        
    {
	if(semi == 3)
	{
	    System.out.println("The running order for the final is: \n_____________________________________________");
	    for(int i = 0; i<songs.length;i++)
	    {
		System.out.println((i+1) + ". " + songs[i].getCountryName());
	    }
	}
	else
	{

	    System.out.println("The running order for Semi Final " + semi + " is: \n_____________________________________________");
	    for(int i = 0; i<songs.length;i++)
	    {
		System.out.println((i+1) + ". " + songs[i].getCountryName());
	    }
	}
    }
    public static void createCountries()
    {
	contestInfo[0] = new entryInfo("Alma Livre", 2);
	contestInfo[1] = new entryInfo("Alteus", 5);
	contestInfo[2] = new entryInfo("Amsteris", 4);
	contestInfo[3] = new entryInfo("Aonach", 4);
	contestInfo[4] = new entryInfo("Aurävaan", 2, "Auravaan");
	contestInfo[5] = new entryInfo("Auspikitan", 5);
	contestInfo[6] = new entryInfo("Bitland", 1);
	contestInfo[7] = new entryInfo("Bubblique", 3);
	contestInfo[8] = new entryInfo("Caprika", 2);
	contestInfo[9] = new entryInfo("Chruno", 5);
	contestInfo[10] = new entryInfo("Darkria", 1);
	contestInfo[11] = new entryInfo("Eriod", 1);
	contestInfo[12] = new entryInfo("Fierce", 4);
	contestInfo[13] = new entryInfo("Gandhara", 2);
	contestInfo[14] = new entryInfo("Grolskira", 2);
	contestInfo[15] = new entryInfo("H Kim Jong Il's AD Hangug", 3, "HKJIADH");
	contestInfo[16] = new entryInfo("Hanzyuki", 2);
	contestInfo[17] = new entryInfo("Háttuka", 1, "Hattuka");
	contestInfo[18] = new entryInfo("Haven", 5);
	contestInfo[19] = new entryInfo("Huania", 3);
	contestInfo[20] = new entryInfo("Land of Jhe Freeh", 2);
	contestInfo[21] = new entryInfo("Kaledonii", 4);
	contestInfo[22] = new entryInfo("Kaministiquia", 5);
	contestInfo[23] = new entryInfo("Keohretcha", 2);
	contestInfo[24] = new entryInfo("Kimmystan", 5);
	contestInfo[25] = new entryInfo("Kosma", 2);
	contestInfo[26] = new entryInfo("Lacrea", 1);
	contestInfo[27] = new entryInfo("Laranjeiras", 4, "RC Laranjeiras");
	contestInfo[28] = new entryInfo("Leshia", 4);
	contestInfo[29] = new entryInfo("Luzze", 1);
	contestInfo[30] = new entryInfo("Mensa", 1);
	contestInfo[31] = new entryInfo("Monteverde", 5);
	contestInfo[32] = new entryInfo("Nicolas' Neighbour", 4);
	contestInfo[33] = new entryInfo("Noxus", 3);
	contestInfo[34] = new entryInfo("Ova Anova", 3);
	contestInfo[35] = new entryInfo("Pebbleland", 1);
	contestInfo[36] = new entryInfo("Pen Island", 5);
	contestInfo[37] = new entryInfo("Ponásikwa", 5, "Ponasikwa");
	contestInfo[38] = new entryInfo("Pönö", 3, "Pono");
	contestInfo[39] = new entryInfo("Porielana", 4);
	contestInfo[40] = new entryInfo("Rata Sum", 3);
	contestInfo[41] = new entryInfo("Republica Libera", 3);
	contestInfo[42] = new entryInfo("Ruthsina", 1);
	contestInfo[43] = new entryInfo("Saint Eva & Lepland", 4, "SEAL");
	contestInfo[44] = new entryInfo("Spitzenbergen", 4);
	contestInfo[45] = new entryInfo("Sunetti", 5);
	contestInfo[46] = new entryInfo("Tashkveny", 3);
	contestInfo[47] = new entryInfo("Territrius", 1);
	contestInfo[48] = new entryInfo("Thorway", 2);
	contestInfo[49] = new entryInfo("Tikata", 4);
	contestInfo[50] = new entryInfo("Timivar", 5);
	contestInfo[51] = new entryInfo("Tonallan", 2);
	contestInfo[52] = new entryInfo("Valdron", 1);
	contestInfo[53] = new entryInfo("Victoria", 3);
	contestInfo[54] = new entryInfo("Zephyrus", 3);

    }
    public static void calculateBettingOdds()
    {
	int highestScore = 0;
	int holder = 0;
	for(int i = 0;i<NUM_OF_COUNTRIES;i++)
	{
	    int temp = 0;
	    temp = temp + contestInfo[i].getSongInfo().getPotOneAppeal();
	    temp = temp + contestInfo[i].getSongInfo().getPotTwoAppeal();
	    temp = temp + contestInfo[i].getSongInfo().getPotThreeAppeal();
	    temp = temp + contestInfo[i].getSongInfo().getPotFourAppeal();
	    temp = temp + contestInfo[i].getSongInfo().getPotFiveAppeal();

	    if(temp > highestScore)
	    {
		highestScore = temp;
		holder = i;
	    }


	}
	System.out.println("The leader in the betting odds is currently " + contestInfo[holder].getCountryName() + " but it is still early!");
    }
}

