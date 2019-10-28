package quan;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static String repeatfunc(String s) {
        String[] words = s.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Case 1: My name name is Quan");
        System.out.println("Case 2: I want to to go to the the the zoo");
        System.out.println("Case 3: Hello Hello Hello. My My My name is Quan");
        System.out.println("Case 4: aa aaa aaaa");
        System.out.println("Case 5: My My name name is is Quan Quan");
        int check = scan.nextInt();
        switch (check) {
		case 1:
			System.out.println("Expect Ouput: My REPEAT is Quan");
			System.out.println("Real Output: " + repeatfunc("My name name is Quan"));
			break;
		case 2:
			System.out.println("Expect Ouput: I want REPEAT go to REPEAT zoo");
			System.out.println("Real Output: " + repeatfunc("I want to to go to the the the zoo"));
			break;
		case 3:
			System.out.println("Expect Ouput: REPEAT. REPEAT name is Quan");
			System.out.println("Real Output: " + repeatfunc("Hello Hello Hello. My My My name is Quan"));
			break;
		case 4:
			System.out.println("Expect Ouput: aa aaa aaaa");
			System.out.println("Real Output: " + repeatfunc("aa aaa aaaa"));
			break;
		case 5:
			System.out.println("Expect Ouput: REPEAT REPEAT REPEAT REPEAT");
			System.out.println("Real Output: " + repeatfunc("My My name name name is is is Quan Quan"));
			break;	

		default:
			break;
		}
        
    }
}
