package application;
import java.util.*;

public class string {
	String name;
	
	public string(String name) {
		this.name=name;
		
	}
	
	public String formatEmployee() {
		String words[]=name.toLowerCase().split("");
		StringBuilder formattedName=new StringBuilder();
		for(String word:words) {
			formattedName.append(Character.toUpperCase(charAt[0])).append(word.substring(1)).append("");
		}
		return formattedName.toString().trim();
		
	}
}
