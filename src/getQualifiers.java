public class getQualifiers
{
    int[] d, a;
    entryInfo[] entries, qualifiers;
    int q;
    public getQualifiers(entryInfo[] e, int amountOfQualifiers)
    {
	q = (int) (amountOfQualifiers/2);
	qualifiers = new entryInfo[q];
        d = new int[e.length];
        a = new int[e.length];
        entries = e;
        for(int i = 0; i<e.length;i++)
        {
            d[i] = entries[i].getSemiScore();
            a[i] = entries[i].getSemiIJScore();
        }
        findTopTen();
    }
    public entryInfo[] getTheQualifiers()
    {
        return qualifiers;
    }
    public entryInfo[] getNonQualifiers()
    {
        entryInfo[] returnVal = new entryInfo[entries.length-q];
        int temp = 0;
        
        for(int i = 0; i<entries.length;i++)
        {
            boolean isQualifier = false;
            for(int j = 0; j<qualifiers.length;j++)
            {
                if(qualifiers[j].getCountryName().equals(entries[i].getCountryName()))
                {
                    isQualifier = true;
                    break;
                }
            }
            if(!isQualifier)returnVal[temp++] = entries[i];
        }
        return returnVal;
    }
    protected void findTopTen()
    {
        int tempFirst = 0, tempSecond = 0, tempThird = 0, tempFourth = 0, tempFifth = 0, tempSixth = 0, tempSeventh = 0, tempEighth = 0, tempNinth = 0, tempTenth = 0, tempEleventh = 0, tempTwelfth = 0;
        int holderFirst = 0, holderSecond = 0, holderThird = 0, holderFourth = 0, holderFifth = 0, holderSixth = 0, holderSeventh = 0, holderEighth = 0, holderNinth = 0, holderTenth = 0, holderEleventh = 0, holderTwelfth = 0;
        
        for(int i = 0; i <d.length;i++)            
        {
            if(tempFirst < d[i])
            {
                tempTwelfth = tempEleventh;
                tempEleventh = tempTenth;
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
                
                holderTwelfth = holderEleventh;
                holderEleventh = holderTenth;
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
                    tempTwelfth = tempEleventh;
                    tempEleventh = tempTenth;
                    tempTenth = tempNinth;
                    tempNinth = tempEighth;
                    tempEighth = tempSeventh;
                    tempSeventh = tempSixth;
                    tempSixth = tempFifth;
                    tempFifth= tempFourth;
                    tempFourth = tempThird;
                    tempThird = tempSecond;
                    tempSecond = d[i];
                    
                    holderTwelfth = holderEleventh;
                    holderEleventh = holderTenth;
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
                        tempTwelfth = tempEleventh;
                        tempEleventh = tempTenth;
                        tempTenth = tempNinth;
                        tempNinth = tempEighth;
                        tempEighth = tempSeventh;
                        tempSeventh = tempSixth;
                        tempSixth = tempFifth;
                        tempFifth= tempFourth;
                        tempFourth = tempThird;
                        tempThird = d[i];
                        
                        holderTwelfth = holderEleventh;
                        holderEleventh = holderTenth;
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
                            tempTwelfth = tempEleventh;
                            tempEleventh = tempTenth;
                            tempTenth = tempNinth;
                            tempNinth = tempEighth;
                            tempEighth = tempSeventh;
                            tempSeventh = tempSixth;
                            tempSixth = tempFifth;
                            tempFifth= tempFourth;
                            tempFourth = d[i];
                            
                            holderTwelfth = holderEleventh;
                            holderEleventh = holderTenth;
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
                            if(tempFifth < d[i])
                            {
                                tempTwelfth = tempEleventh;
                                tempEleventh = tempTenth;
                                tempTenth = tempNinth;
                                tempNinth = tempEighth;
                                tempEighth = tempSeventh;
                                tempSeventh = tempSixth;
                                tempSixth = tempFifth;
                                tempFifth= d[i];
                                
                                holderTwelfth = holderEleventh;
                                holderEleventh = holderTenth;
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
                                    tempTwelfth = tempEleventh;
                                    tempEleventh = tempTenth;
                                    tempTenth = tempNinth;
                                    tempNinth = tempEighth;
                                    tempEighth = tempSeventh;
                                    tempSeventh = tempSixth;
                                    tempSixth = d[i];
                                    
                                    holderTwelfth = holderEleventh;
                                    holderEleventh = holderTenth;
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
                                        tempTwelfth = tempEleventh;
                                        tempEleventh = tempTenth;
                                        tempTenth = tempNinth;
                                        tempNinth = tempEighth;
                                        tempEighth = tempSeventh;
                                        tempSeventh = d[i];
                                        
                                        holderTwelfth = holderEleventh;
                                        holderEleventh = holderTenth;
                                        holderTenth = holderNinth;
                                        holderNinth = holderEighth;
                                        holderEighth = holderSeventh;
                                        holderSeventh = i;
                                        
                                    }
                                    else
                                    {
                                        if(tempEighth < d[i])
                                        {
                                            tempTwelfth = tempEleventh;
                                            tempEleventh = tempTenth;
                                            tempTenth = tempNinth;
                                            tempNinth = tempEighth;
                                            tempEighth = d[i];
                                            
                                            holderTwelfth = holderEleventh;
                                            holderEleventh = holderTenth;
                                            holderTenth = holderNinth;
                                            holderNinth = holderEighth;
                                            holderEighth = i;
                                            
                                        }
                                        else
                                        {
                                            if(tempNinth < d[i])
                                            {
                                                tempTwelfth = tempEleventh;
                                                tempEleventh = tempTenth;
                                                tempTenth = tempNinth;
                                                tempNinth = d[i];
                                                
                                                holderTwelfth = holderEleventh;
                                                holderEleventh = holderTenth;
                                                holderTenth = holderNinth;
                                                holderNinth = i;
                                                
                                            }
                                            else
                                            {
                                                if(tempTenth < d[i])
                                                {
                                                    tempTwelfth = tempEleventh;
                                                    tempEleventh = tempTenth;
                                                    tempTenth = d[i];
                                                    
                                                    holderTwelfth = holderEleventh;
                                                    holderEleventh = holderTenth;
                                                    holderTenth = i;
                                                    
                                                }
                                                else
                                                {
                                                    if(tempEleventh < d[i])
                                                    {
                                                        tempTwelfth = tempEleventh;
                                                        tempEleventh = d[i];                                                        
                                                        
                                                        holderTwelfth = holderEleventh;
                                                        holderEleventh = i;
                                                        
                                                    }
                                                    else
                                                    {
                                                        if(tempTwelfth < d[i])
                                                        {
                                                            tempTwelfth = d[i];                                                                                                                
                                                            
                                                            holderTwelfth = i;
                                                            
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
            }
        }
        
        qualifiers[0] = entries[holderFirst];
        qualifiers[1] = entries[holderSecond];
        qualifiers[2] = entries[holderThird];
        qualifiers[3] = entries[holderFourth];
        qualifiers[4] = entries[holderFifth];
        qualifiers[5] = entries[holderSixth];
        qualifiers[6] = entries[holderSeventh];
        qualifiers[7] = entries[holderEighth];
        qualifiers[8] = entries[holderNinth];
        qualifiers[9] = entries[holderTenth];
        if(q > 11)
        {
            qualifiers[10] = entries[holderEleventh];
            entries[holderEleventh].setQualifier();
            if(q > 12)
            {
        	qualifiers[11] = entries[holderTwelfth];
        	entries[holderTwelfth].setQualifier();
            }
            
        }
        
        
        entries[holderFirst].setQualifier();
        entries[holderSecond].setQualifier();
        entries[holderThird].setQualifier();
        entries[holderFourth].setQualifier();
        entries[holderFifth].setQualifier();
        entries[holderSixth].setQualifier();
        entries[holderSeventh].setQualifier();
        entries[holderEighth].setQualifier();
        entries[holderNinth].setQualifier();
        entries[holderTenth].setQualifier();
        
        
        
        if(q != 10)findIJQualifier();
    }
    public void findIJQualifier()
    {
         int tempFirst = 0;
         int holderFirst = 0;
         for(int i = 0; i <a.length;i++)            
        {
            if(tempFirst < a[i] && !entries[i].isQualifier())
            {                
                tempFirst = a[i];                
                holderFirst = i;
            }
         }
         qualifiers[q-1] = entries[holderFirst];
    }
}

