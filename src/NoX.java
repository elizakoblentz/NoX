import java.util.List;

public class NoX {
	public List<String> noX(List<String> strings) {
		  for (int index = 0; index < strings.size(); index++)
		  {
		    String word = strings.get(index);
		    if (word.indexOf ("x") >= 0)
		    {
		      word = word.replace ("x", "");
		    }
		    strings.set(index, word);
		  }
		 return strings; 
		}
}
