package collections;

import java.util.HashSet;
import java.util.Set;

public class findShortestBalancedSubstring {
	public static void main(String[] args) {
        //System.out.println("Final:" +getShortestFragment("ABcabbCa"));
        //System.out.println("Final:"+getShortestFragment("azABaabza"));
        //System.out.println(getShortestFragment("CATattac"));
        //System.out.println(getShortestFragment("TacoCat"));
        System.out.println("Final:" +getShortestFragment("Madam"));
        //System.out.println(getShortestFragment("AcZCbaBz"));
        //System.out.println(getShortestFragment("aZABcabbCa"));*/
    }

    static String getShortestFragment(String str){
        for(int k=1;k<=str.length();k++){
            for(int i=0;i<str.length()-k+1;i++){
                Set<Character> lowerSet = new HashSet<>();
                Set<Character> upperSet = new HashSet<>();
                String temp = str.substring(i,i+k);
                System.out.println(temp);
                char[] tempCharArr = temp.toCharArray();
                for(char ch : tempCharArr){
                if(Character.isLowerCase(ch))
                    lowerSet.add(ch);
                else
                    upperSet.add(ch);
                }
                if(containsAllElements(lowerSet, upperSet) && containsAllElements(upperSet, lowerSet)){
                    return temp;
                }
            }            
        }
        return "-1";   
    }

    static boolean containsAllElements(Set<Character> first, Set<Character> second){
    	//System.out.println(first);
    	//System.out.println(second);
        Set<Character> lower1 = new HashSet<>();
        Set<Character> lower2 = new HashSet<>();
        first.forEach((e) -> {
            lower1.add(Character.toLowerCase(e));
        });
       second.forEach((e) -> {
            lower2.add(Character.toLowerCase(e));
        });
        return lower1.containsAll(lower2);
    }
}