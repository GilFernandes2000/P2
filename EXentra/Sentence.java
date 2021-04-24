public class Sentence
{
	public Sentence(String text)
    {
      // TODO: Add assert statements
      assert text != "";
      int n = text.length();
      String punctuation = text.substring(n - 1, n);
      words = text.substring(0, n - 1).split(" ");
      boolean spacesOK = true;
      for (int i = 0; i < words.length; i++)
	  {
		  if (words[i].length()==0)
		  {
			  spacesOK = false;
			  break;
		  }
	  }
	  assert spacesOK;
	  
      assert n > 0;
      assert punctuation == "!" || punctuation == "?" ||punctuation == ".";
    }
    
    public int getWordCount()
    {
      return words.length;
    }
    
    public String getWord(int i)
    {
	  assert i >=0;
      return words[i];
    }
   
    public String toString()
    {
      String r = "";
      for (String w : words)
      {
         if (r.length() > 0) r += " ";
         r += w;
      }
      return r + punctuation;
    }
   
    private String[] words;
    private String punctuation;
    
    public static String check(String text)
    {
      try
      {
         Sentence s = new Sentence(text);
         return "Constructor completed normally";      
      }
      catch (AssertionError error)
      {
         return "Precondition violation detected";
      }
      catch (Exception exception)
      {
         return "Exception in constructor";
      }
    }
}
