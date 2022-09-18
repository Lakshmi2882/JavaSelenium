package Abstractclass;

import java.util.Hashtable;
import java.util.Map;

public class HashTableconcept {

	public static void main(String[] args) {
		Hashtable<String, Integer> m1=new Hashtable<String,Integer>();
		m1.put("iphone12",2000);
		m1.put("iphone13", 4000);
		m1.put("iphone11", 1000);
	//	m1.put(null,20);//Nullpointer Exception
		m1.put("iphone",null);//Nullpointer
		for(Map.Entry m: m1.entrySet())
		{
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
//HashMap is non synchronised and not threadsafe
		//Concurrent HAshMap can make Nonsynchronised and threadsafe but it is not 100%
		//HashMap can have one nullkey and multiple null values
		//HASHTABLE does not allow Null key and null value
	

}
}
