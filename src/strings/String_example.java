package strings;

public class String_example {

	public static void main(String[] args) {
		/*
		String name="Prem Kumar";
		//String name=new String("Prem");
		System.out.println("charAt: "+name.charAt(1));
		System.out.println("length: "+name.length());
		System.out.println("indexOf: "+name.indexOf('e'));
		System.out.println("indexOf: "+name.indexOf("mar"));
		System.out.println("subString: "+name.substring(3));
		System.out.println("subString: "+name.substring(2,7));
		*/
		/*
		String line="While uploading the file, file is not uploaded and  it throwing Error";
		System.out.println("indexOf: "+line.indexOf('e'));
		System.out.println("lastIndexOf: "+line.lastIndexOf('E'));
		System.out.println("indexOf_index: "+line.indexOf('e', 20));
		System.out.println("lastIndexOf_index: "+line.lastIndexOf('e', 20));
		
		System.out.println("replace char: "+line.replace('f', 'g'));
		System.out.println("replace charsequence: "+line.replace("file", "folder"));
		System.out.println("toUpper: "+line.toUpperCase());
		System.out.println("toLower: "+line.toLowerCase());
		*/
		
		String amount="Rs.500";
		String cmpamount="Rs.500";
		System.out.println("compareTo: "+amount.compareTo(cmpamount));
		if(amount.compareTo(cmpamount)==0)
		{
			System.out.println("Same");	
		}
		else
		{
			System.out.println("Not Same");	
		}
		
		System.out.println("compareTo: "+amount.compareToIgnoreCase(cmpamount));
		if(amount.compareToIgnoreCase(cmpamount)==0)
		{
			System.out.println("Same");	
		}
		else
		{
			System.out.println("Not Same");	
		}
		
		System.out.println("equals: "+amount.equals(cmpamount));
		if(amount.equals(cmpamount))
		{
			System.out.println("Same");	
		}
		else
		{
			System.out.println("Not Same");	
		}
		
		System.out.println("equals: "+amount.equals(cmpamount));
		if(amount.equals(cmpamount)==false)
		{
			System.out.println("Not Same");	
		}
		else
		{
			System.out.println("Same");	
		}
	}

}
