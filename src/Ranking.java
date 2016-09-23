public class Ranking
{
    int[] teleRankings, teleRanking, juryRanking;
    double[] juryRankings;
    public Ranking(int[] a)
    {
        teleRankings = a;
        teleRanking = returnTelePlaces();
    }
    public Ranking(double[] b)
    {
        juryRankings = b;
        juryRanking = returnJuryPlaces();
    }
    
    public int[] returnTelePlaces()
    {
        int[] returnVal = new int[teleRankings.length];
        for(int i = 0; i<teleRankings.length;i++)
        {
            int temp = 1;
            for(int j = 0; j<teleRankings.length;j++)
            {
                if(teleRankings[i] < teleRankings[j] || (teleRankings[i] == teleRankings[j] && i > j))
                {
                    temp++;
                }
            }
            returnVal[i] = temp;
        }
        return returnVal;
    }
    public int[] returnJuryPlaces()
    {
        int[] returnVal = new int[juryRankings.length];
        for(int i = 0; i<juryRankings.length;i++)
        {
            int temp = 1;
            for(int j = 0; j<juryRankings.length;j++)
            {
                if(juryRankings[i] < juryRankings[j] || (juryRankings[i] == juryRankings[j] && i > j))
                {
                    temp++;
                }
            }
            returnVal[i] = temp;
        }
        return returnVal;
    }
    public int[] getJuryRanking()
    {
        return juryRanking;
    }
    public int[] getTeleRanking()
    {
        return teleRanking;
    }
    public int getWinnerLocation(int[] thing)
    {
        int highestScore = 0;
        int holder = 0;
        for(int i = 0;i<thing.length;i++)
        {                
            if(thing[i] > highestScore)
            {
                highestScore = thing[i];
                holder = i;
            }
                
                
        }
        return holder;
    }
    
}