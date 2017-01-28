package ebys;

import java.util.Hashtable;

public class NotGoruntuleme {
	
	public int notGoruntule(Ders ders,NotTip type){
        Hashtable<NotTip, Integer> not=null;
        not=ders.getNotList();
        if(not.containsKey(type))
            return not.get(type);


        return 0;
    }
    public float notHesaplat(Ders ders, DonemTip tip){
        Hashtable<NotTip, Integer> not=ders.getNotList();
        Hashtable<NotTip, Double> yuzde=ders.getYuzdeList();
        float total=0;

        switch (tip) {
            case DONEMICI:
                total =(float) (not.get(NotTip.VIZE)*yuzde.get(NotTip.VIZE)+not.get(NotTip.PROJE)*yuzde.get(NotTip.PROJE));
                break;
            case DONEMSONU:
                total =(float) (not.get(NotTip.VIZE)*yuzde.get(NotTip.VIZE)+not.get(NotTip.PROJE)*yuzde.get(NotTip.PROJE)+not.get(NotTip.FINAL)*yuzde.get(NotTip.FINAL));
                break;
        }
        return total;
    }
    public String harfNotuHesapla(Ders ders){
        String harfNotu=null;
        if(notHesaplat(ders,DonemTip.DONEMSONU)<45)
            harfNotu= "DC";
        else if(notHesaplat(ders,DonemTip.DONEMSONU)>=45 && notHesaplat(ders,DonemTip.DONEMSONU)<55)
            harfNotu="CC";
        else if(notHesaplat(ders,DonemTip.DONEMSONU)>=55 && notHesaplat(ders,DonemTip.DONEMSONU)<65)
            harfNotu="CB";
        else if(notHesaplat(ders,DonemTip.DONEMSONU)>=65 && notHesaplat(ders,DonemTip.DONEMSONU)<75)
            harfNotu="BB";
        else if(notHesaplat(ders,DonemTip.DONEMSONU)>=75 && notHesaplat(ders,DonemTip.DONEMSONU)<85)
            harfNotu="BA";
        else if(notHesaplat(ders,DonemTip.DONEMSONU)>=85)
            harfNotu="AA";
        return harfNotu;
    }
}
