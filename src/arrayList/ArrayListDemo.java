package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>(Arrays.asList(23,43,5678,432,4567));
		System.out.println("ArrayList2 Elements are:"+al2);
		
		al.add(23);
		al.add(34);
		al.add(45);
		al.add(100);
		al.add(new Integer(456));
		System.out.println("ArrayList Elements are:"+al);
		al.add(0,342);
		System.out.println("ArrayList Elements are:"+al);
		al.set(0,5);
		System.out.println("ArrayList Elements are:"+al);
       al.remove(3);
       System.out.println("ArrayList Elements are:"+al);
      
       al.addAll(al2);
       System.out.println("ArrayList Elements are:"+al);
       al.removeAll(al2);
       System.out.println("ArrayList Elements are:"+al);
       System.out.println("ArrayList Print through for loop");
       for(int i=0;i<al.size();i++)
       {
    	   System.out.println(al.get(i));
       }
       System.out.println("ArrayList through for-in loop");
       for(Integer in:al)
       {
    	   System.out.println(in);
       }
       System.out.println("Through while loop");
       int i=0;
       while(i< al.size())
       {
    	   System.out.println(al.get(i));
    	   i++;
       }
       System.out.println("For Iterator");
       Iterator<Integer> itr=al.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       

	}

}
