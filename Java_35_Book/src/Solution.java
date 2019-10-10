import java.util.Arrays;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
	       
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < participant.length; i++) {
			if(participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
	        
		return null;
	   
	}
}
