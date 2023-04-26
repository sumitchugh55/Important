package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeated {
public static void main(String[] args) {
	String s="suumit z ";
	s=s.replace(" ","");
	HashMap<Character, Integer> hm=new HashMap<>();
	char[] c=s.toCharArray();
	for(char ch:c) {
		if(hm.containsKey(ch)) {
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch,1);
			
		}
	}
	int maxcount=0; 
	char maxchar=' ';
	
	for(Map.Entry<Character, Integer> me:hm.entrySet())
	{
		if(maxcount <me.getValue())
		{
			maxcount=me.getValue();
			maxchar=me.getKey();
			
		}
	}
	
	System.out.println(maxchar);
}
}
