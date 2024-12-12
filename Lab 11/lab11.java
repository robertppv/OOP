import java.util.*;

abstract class Tip {
    public abstract String getTip();
    public abstract String toString();
}

class Intreg extends Tip{
    private int numar;

    public Intreg(int n){
        this.numar=n;
    }


    public String getTip(){
        return "Tip: Intreg";
    }

    public String toString(){
        return " " + numar;
    }
}
class Sir extends Tip{
    private String sir;

    public Sir(String s){
        this.sir=s;
    }

    public String getTip(){
        return "Tip: Sir";
    }
    public String toString(){
        return sir;
    }
}

class Colectie extends Tip{
    private List<Tip> colectie;

    public Colectie(){
        colectie = new ArrayList<>();
    }
    public String getTip(){
        return "Tip: Colectie";
    }

    public String toString(){
        String s="(";
        Iterator t= colectie.iterator();
        while(t.hasNext()){
            s=s+(Tip)t.next() +", ";
        }
        return s+")";
        }


    public boolean equals(Object o){
        if(o instanceof Colectie){
            if(colectie.size() != ((Colectie)o).colectie.size())
                return false;
            else{
                for(int i=0;i<colectie.size();i++)
                {
                    if(colectie.get(i)!=((Colectie)o).colectie.get(i))
                        return false;
                }
                return true;
            }
        }
        else{
            return false;
        }
    }

    public void adauga(Tip o){
        colectie.add(o);
    }
}


class Main{

    public static void main(String[] args){

    Tip i1=new Intreg(7);
    Tip i2=new Intreg(4);
    Tip i3=new Intreg(12);
    Tip i4=new Intreg(2);
    Tip i5=new Intreg(8);
    Tip c1=new Colectie();
    Tip c2=new Colectie();
    Tip s=new Sir("Eu");
    ((Colectie)c1).adauga(i1);
    ((Colectie)c1).adauga(i2);

    }
}
