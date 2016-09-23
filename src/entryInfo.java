public class entryInfo
{
    String countryName, artistName, songName, alternateName;
    boolean isNationalFinal, isHost, isQualifier;
    int semiPoints, finalPoints, selectionDate, location, semiNumber, semiTelevote, finalTelevote, semiJury, isPlayer, ijSemiPoints;
    songsInfo officialEntry;
    
    public entryInfo(String c, int loc)
    {
        countryName = c;
        artistName = "None";
        songName = "None";
        isPlayer = -1;
        semiPoints = 0;
        finalPoints = 0;
        semiTelevote = 0;
        semiJury = 0;
        finalTelevote = 0;
        officialEntry = new songsInfo(0,0,0,0,0,0,0);
        location = loc;
        isHost = false;
        alternateName = c;
    }
    public entryInfo(String c, int loc, String altName)
    {
        countryName = c;
        artistName = "None";
        songName = "None";
        isPlayer = -1;
        semiPoints = 0;
        finalPoints = 0;
        semiTelevote = 0;
        semiJury = 0;
        finalTelevote = 0;
        officialEntry = new songsInfo(0,0,0,0,0,0,0);
        location = loc;
        isHost = false;
        alternateName = altName;
    }
    public entryInfo(String c, int loc, String altName, String theArtistName, String theSongName)
    {
	countryName = c;
        artistName = theArtistName;
        songName = theSongName;
        isPlayer = -1;
        semiPoints = 0;
        finalPoints = 0;
        semiTelevote = 0;
        semiJury = 0;
        finalTelevote = 0;
        officialEntry = new songsInfo(0,0,0,0,0,0,0);
        location = loc;
        isHost = false;
        alternateName = altName;
    }
    public void addSemiTelevote(int num)
    {
        semiTelevote = semiTelevote+num;
        
    }
    public void addFinalTelevote(int num)
    {
        finalTelevote = finalTelevote+num;
        
    }
    public void addSemiJury(int num)
    {
        semiJury = semiJury+num;
        
    }
    public int getSemiTelevote()
    {
        return semiTelevote;
        
    }
    public int getSemiJury()
    {
        return semiJury;
        
    }
    public void addSemiScore(int num)
    {
        semiPoints = semiPoints+num;
    }
    public void addIJSemiScore(int num)
    {
        ijSemiPoints = ijSemiPoints+num;
    }
    public void addFinalScore(int num)
    {
        finalPoints = finalPoints+num;
    }
    public String getCountryName()
    {
        return countryName;
    }
    public String getAltCountryName()
    {
        return alternateName;
    }
    public String getArtistName()
    {
        return artistName;
    }
    public String getSongName()
    {
        return songName;
    }
    public int getPlayer()
    {
        return isPlayer;
    }
    public boolean getNationalFinal()
    {
        return isNationalFinal;
    }
    public int getSelectionDate()
    {
        return selectionDate;
    }
    public songsInfo getSongInfo()
    {
        return officialEntry;
    }
    public int getLocation()
    {
        return location;
    }
    public void setArtistName(String a)
    {
        artistName = a;
    }
    public void setSongName(String s)
    {
        songName = s;
    }
    public void setPlayer(int b)
    {
        isPlayer = b;
    }
    public void setNationalFinal(boolean b)
    {
        isNationalFinal = b;
    }
    public void setSelectionDate(int d)
    {
        selectionDate = d;
    }
    public void setSongInfo(songsInfo s)
    {
        officialEntry = s;
    }
    public void updateScores()
    {
        officialEntry.update(location);
    }
    public void setSemiFinal(int a)
    {
        semiNumber = a;
    }
    public int getSemiFinal()
    {
        return semiNumber;
    }
    public int getSemiScore()
    {
        return semiPoints;
    }
    public int getSemiIJScore()
    {
        return ijSemiPoints;
    }
    public int getFinalPoints()
    {
        return finalPoints;
    }
    public int getFinalTelevote()
    {
        return finalTelevote;
    }
    public boolean getHost()
    {
        return isHost;
    }
    public void setHost(boolean b)
    {
        isHost = b;
    }
    public void setQualifier()
    {
        isQualifier = true;
    }
    public boolean isQualifier()
    {
        return isQualifier;
    }
}