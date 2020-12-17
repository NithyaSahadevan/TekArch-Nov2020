package JavaPrograms;

import java.util.HashMap;

public class Assignment28 {

	//WJP Find the frequency of each character in a given string String: "Java is an object oriented programming language"
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is an object oriented programming language";
		char[] c=str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : c)
		{
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				map.put(ch, ++count);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		for(char ch : map.keySet())
		{
			if((map.get(ch)>0) && !Character.isWhitespace(ch)) {
				 System.out.println(ch + " occurs " + map.get(ch) + " times");
			}
		}
	}

}
