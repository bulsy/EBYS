package ebys;

import java.util.Hashtable;

public class NotGoruntuleme {
	
	public int notGoruntule(Ders ders,String type){
		Hashtable<String, Integer> not=null;
                not=ders.getNotList();
                if(not.containsKey(type))
                	return not.get(type);
            
        
        return 0;
	}
	public float notHesaplat(Ders ders, String type){
		Hashtable<String, Integer> not=ders.getNotList();
		Hashtable<String, Double> yuzde=ders.getYuzdeList();
		float total=0;
		switch (type) {
        case "donemici":  
        	  total =(float) (not.get("vize")*yuzde.get("vize")+not.get("proje")*yuzde.get("proje"));
              break;
        case "donemsonu":  
        	  total =(float) (not.get("vize")*yuzde.get("vize")+not.get("proje")*yuzde.get("proje")+not.get("final")*yuzde.get("final"));
              break;
		}
		return total;
	}	
	 public String harfNotuHesapla(Ders ders){
		 String harfNotu=null;
	        if(notHesaplat(ders,"donemsonu")<45)
	            harfNotu= "DC";
	        else if(notHesaplat(ders,"donemsonu")>=45 && notHesaplat(ders,"donemsonu")<55)
	            harfNotu="CC";
	        else if(notHesaplat(ders,"donemsonu")>=55 && notHesaplat(ders,"donemsonu")<65)
	            harfNotu="CB";
	        else if(notHesaplat(ders,"donemsonu")>=65 && notHesaplat(ders,"donemsonu")<75)
	            harfNotu="BB";
	        else if(notHesaplat(ders,"donemsonu")>=75 && notHesaplat(ders,"donemsonu")<85)
	            harfNotu="BA";
	        else if(notHesaplat(ders,"donemsonu")>=85)
	            harfNotu="AA";
	        return harfNotu;
	    }
}
