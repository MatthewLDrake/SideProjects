import java.util.Random;
public class semiFinals
{
    songsInfo[] songs; 
    entryInfo[] entries;
    addRealism real;
    public semiFinals(entryInfo[] e, int[] v)
    {
        
        entries = e;
        songs = new songsInfo[entries.length];
        for(int i = 0; i<e.length;i++)
        {
            songs[i] = entries[i].getSongInfo();
        }
        
       
        for(int i = 0; i<entries.length;i++)
        {
            teleVote(entries[i].getLocation(),i, false, entries[i].getCountryName());
        }
        for(int i = 0; i < v.length; i++)
        {
            teleVote(v[i],-1,true, "");
        }
    }
    
    public void teleVote(int location, int j, boolean t, String name)
    {
        int[] teleScores = new int[songs.length];
        for(int i = 0; i<songs.length;i++)
        {
            real = new addRealism(entries[i].getCountryName(),name);
            if(i!=j && !t)teleScores[i] = teleVote(songs[i],location, real.returnModifier());
            else teleScores[i] = teleVote(songs[i],location, 1);
        }
        givePoints(teleScores, t);
    }
    private int teleVote(songsInfo song, int location, double modifier)
    {
        int temp = 0;
        if(location == 1)temp = song.getPotOneAppeal();
        else if(location == 2)temp = song.getPotTwoAppeal();
        else if(location == 3)temp = song.getPotThreeAppeal();
        else if(location == 4)temp = song.getPotFourAppeal();
        else if(location == 5)temp = song.getPotFiveAppeal();    

        
        
        
        Random r = new Random();
        int temp2 = (int)Math.round((temp*1000)/(r.nextDouble()));
        temp2 = (int)(temp2*modifier);
        
        return temp2;
    }
    
    public void givePoints(int[] d, boolean b)
    {
        int tempFirst = 0, tempSecond = 0, tempThird = 0, tempFourth = 0, tempFifth = 0, tempSixth = 0, tempSeventh = 0, tempEighth = 0, tempNinth = 0, tempTenth = 0;
        int holderFirst = 0, holderSecond = 0, holderThird = 0, holderFourth = 0, holderFifth = 0, holderSixth = 0, holderSeventh = 0, holderEighth = 0, holderNinth = 0, holderTenth = 0;
        
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
                
                holderTenth = holderNinth;
                holderNinth = holderEighth;
                holderEighth = holderSeventh;
                holderSeventh = holderSixth;
                holderSixth = holderFifth;
                holderFifth= holderFourth;
                holderFourth = holderThird;
                holderThird = holderSecond;
                holderSecond = holderFirst;
                holderFirst = i;
                
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
                    
                    holderTenth = holderNinth;
                    holderNinth = holderEighth;
                    holderEighth = holderSeventh;
                    holderSeventh = holderSixth;
                    holderSixth = holderFifth;
                    holderFifth= holderFourth;
                    holderFourth = holderThird;
                    holderThird = holderSecond;
                    holderSecond = i;
                    
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
                        
                        holderTenth = holderNinth;
                        holderNinth = holderEighth;
                        holderEighth = holderSeventh;
                        holderSeventh = holderSixth;
                        holderSixth = holderFifth;
                        holderFifth= holderFourth;
                        holderFourth = holderThird;
                        holderThird = i;
                        
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
                            
                            holderTenth = holderNinth;
                            holderNinth = holderEighth;
                            holderEighth = holderSeventh;
                            holderSeventh = holderSixth;
                            holderSixth = holderFifth;
                            holderFifth= holderFourth;
                            holderFourth = i;
                            
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
                                
                                holderTenth = holderNinth;
                                holderNinth = holderEighth;
                                holderEighth = holderSeventh;
                                holderSeventh = holderSixth;
                                holderSixth = holderFifth;
                                holderFifth= i;
                                
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
                                    
                                    holderTenth = holderNinth;
                                    holderNinth = holderEighth;
                                    holderEighth = holderSeventh;
                                    holderSeventh = holderSixth;
                                    holderSixth = i;
                                    
                                }
                                else
                                {
                                    if(tempSeventh < d[i])
                                    {
                                        tempTenth = tempNinth;
                                        tempNinth = tempEighth;
                                        tempEighth = tempSeventh;
                                        tempSeventh = d[i];
                                        
                                        holderTenth = holderNinth;
                                        holderNinth = holderEighth;
                                        holderEighth = holderSeventh;
                                        holderSeventh = i;
                                        
                                    }
                                    else
                                    {
                                        if(tempEighth < d[i])
                                        {
                                            tempTenth = tempNinth;
                                            tempNinth = tempEighth;
                                            tempEighth = d[i];
                                            
                                            holderTenth = holderNinth;
                                            holderNinth = holderEighth;
                                            holderEighth = i;
                                            
                                        }
                                        else
                                        {
                                            if(tempNinth < d[i])
                                            {
                                                tempTenth = tempNinth;
                                                tempNinth = d[i];
                                                
                                                holderTenth = holderNinth;
                                                holderNinth = i;
                                                
                                            }
                                            else
                                            {
                                                if(tempTenth < d[i])
                                                {
                                                    tempTenth = d[i];
                                                    
                                                    holderTenth = i;
                                                    
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
        if(b)
        {
            entries[holderFirst].addIJSemiScore(12);
            entries[holderSecond].addIJSemiScore(10);
            entries[holderThird].addIJSemiScore(8);
            entries[holderFourth].addIJSemiScore(7);
            entries[holderFifth].addIJSemiScore(6);
            entries[holderSixth].addIJSemiScore(5);
            entries[holderSeventh].addIJSemiScore(4);
            entries[holderEighth].addIJSemiScore(3);
            entries[holderNinth].addIJSemiScore(2);
            entries[holderTenth].addIJSemiScore(1);
        }
        else
        {
            entries[holderFirst].addSemiScore(12);
            entries[holderSecond].addSemiScore(10);
            entries[holderThird].addSemiScore(8);
            entries[holderFourth].addSemiScore(7);
            entries[holderFifth].addSemiScore(6);
            entries[holderSixth].addSemiScore(5);
            entries[holderSeventh].addSemiScore(4);
            entries[holderEighth].addSemiScore(3);
            entries[holderNinth].addSemiScore(2);
            entries[holderTenth].addSemiScore(1);
        }
        

    }
}