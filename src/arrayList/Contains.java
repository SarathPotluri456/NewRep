package arrayList;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sarath");
		al.add("How r u?");
		al.add("Hai");
	    ArrayList<String> al1=new ArrayList<String>();
	    al1.add("oy");
	    al1.add("Sarath");
	    al1.add("Hai");
	    al1.add("babu");
	    System.out.println(al.size());
	    if(al.size()>al1.size())
	    {
	    	for(int i=0;i<al.size();i++)
	    	{
	    		if(al.contains(al1.get(i)))
	    			System.out.println(al.get(i));
	    	}
	    }
	    else if(al1.size()>al.size())
	    {
	    	
	    	for(int i=0;i<al1.size();i++)
	    	{
	    		if(al1.contains(al.get(i)))
	    		{
	    			System.out.println(al1.get(i));
	    		}
	    	}
	    }
	    else
	    {
	    	System.out.println("Not Array Lists");
	    }
	}

}
