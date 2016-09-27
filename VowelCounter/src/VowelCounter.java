import java.util.*;
public class VowelCounter {
	
	static int vowelCounter(String s){
		s = s.toLowerCase();
		String[] split = s.split("");
		int total = 0;
		for (int i = 0; i<split.length;i++){
			if (split[i].equals("a") || split[i].equals("e") || 
					split[i].equals("i") || split[i].equals("o") || 
					split[i].equals("u")){
				total+=1;
			}
		}
		return total;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String s = sc.nextLine();
		 int totalVowels = vowelCounter(s);
		 System.out.println("The total number of vowels in " +
		 s + " is: " + totalVowels);
		
	}

}
