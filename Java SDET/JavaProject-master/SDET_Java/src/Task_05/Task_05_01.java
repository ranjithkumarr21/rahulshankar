package Task_05;

import java.util.HashMap;
import java.util.Set;
 
public class Task_05_01 {
	
	  static void duplicateCharCount(String inputString)
	    {
	        
	 
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	 
	        
	 
	        char[] strArray = inputString.toCharArray();
	 
	        
	 
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	               
	 
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                
	 
	                charCountMap.put(c, 1);
	            }
	        }
	 
	        //Getting a Set containing all keys of charCountMap
	 
	        Set<Character> charsInString = charCountMap.keySet();
	 
	        System.out.println("Duplicate Characters In "+inputString);
	 
	        //Iterating through Set 'charsInString'
	 
	        for (Character ch : charsInString)
	        {
	            if(charCountMap.get(ch) > 1)
	            {
	               
	 
	                System.out.println(ch +" : "+ charCountMap.get(ch));
	            }
	        }
	    }

	public static void main(String[] args) {
		duplicateCharCount("Better Butter");

	}

}
