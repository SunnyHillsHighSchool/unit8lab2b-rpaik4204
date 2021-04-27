public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    for (int r = 0; r < nameArray.length; r++)
      {
        for(int c = 0; c < nameArray[r].length; c++)
        {
           if(nameArray[r][c].contains(lastName))
                {
                  count++;
                }
        }
      }
  return count;
  }
}