
public class addRealism
{
    private String countryNumber, voterNumber; 
    private double modifier;
    public addRealism(String countryNum, String voterNum)
    {
	modifier = 1;
	countryNumber = countryNum;
	voterNumber = voterNum;
	checkAlteusVotingBloc();
	checkKosmallan();
	checkZephyrusVictoria();
	checkKaledoniiSpitzenbergen();
	checkBitlandMensa();
	giveBoosts();
	giveNerfs();
    }
    
    private void giveNerfs()
    {
	if(countryNumber.equals("Keohretcha"))modifier = .38;
	else if(countryNumber.equals("Saint Eva & Lepland"))modifier = .37;
	else if(countryNumber.equals("Green Apple"))modifier = .01;
	else if(countryNumber.equals("Valdron"))modifier = .8;
	else if(countryNumber.equals("Caprika"))modifier = .40;
	
    }
    private void giveBoosts()
    {
	if(countryNumber.equals("Kimmystan"))modifier += .25;
	else if(countryNumber.equals("Chruno"))modifier += .3;
	else if(countryNumber.equals("Sunetti"))modifier += .3;
	else if(countryNumber.equals("Alteus"))modifier += .2;
	else if(countryNumber.equals("Porielana"))modifier += .075;
	else if(countryNumber.equals("Kosma"))modifier += .035;
    }
    
    private void checkBitlandMensa()
    {
	if((countryNumber.equals("Bitland") && voterNumber.equals("Mensa")) || (countryNumber.equals("Mensa") && voterNumber.equals("Bitland")))
	{
	    modifier = 20;
	}
	else if(countryNumber.equals("Mensa"))modifier = .33;
	
    }
    private void checkKaledoniiSpitzenbergen()
    {
	if((countryNumber.equals("Kaledonii") && voterNumber.equals("Spitzenbergen")) || (countryNumber.equals("Spitzenbergen") && voterNumber.equals("Kaledonii")))
	{
	    modifier = 15;
	}
	
    }
    private void checkZephyrusVictoria()
    {
	if(countryNumber.equals("Zephyrus") && voterNumber.equals("Victoria"))
	{
	    modifier = 100;
	}
	else if(countryNumber.equals("Victoria") && voterNumber.equals("Zephyrus"))
	{
	    modifier = 10;
	}
	
    }
    private void checkKosmallan()
    {
	if(((countryNumber.equals("Tonallan") || (countryNumber.equals("Tonallán"))) && voterNumber.equals("Kosma")) || (countryNumber.equals("Kosma") && (voterNumber.equals("Tonallan") || (voterNumber.equals("Tonallán")))))
	{
	    modifier = 100;
	}
	
    }
    private void checkAlteusVotingBloc()
    {
	if((countryNumber.equals("Alteus") && voterNumber.equals("Kaministiquia")) || (countryNumber.equals("Kaministiquia") && voterNumber.equals("Alteus")))
	{
	    modifier = 100;
	}
	else if((countryNumber.equals("Alteus") && voterNumber.equals("Auspikitan")) || (countryNumber.equals("Auspikitan") && voterNumber.equals("Alteus")))
	{
	    modifier = 3;
	}
    }
    public double returnModifier()
    {
	return modifier;
    }
}
