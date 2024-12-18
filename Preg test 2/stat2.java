 import java.util.*;
 abstract class Statistica{
     protected  String jurnal;

     public abstract void calculeaza(List<String> secv);

     public Statistica(){
         this.jurnal="";
    }

}

class StatisticaNumarAparitii extends Statistica{
    private List<String> sec;

    public StatisticaNumarAparitii(List<String> sec){
        super();
        this.sec=sec;
    }
    public void calculeaza(List<String> secv){

        int knt=0;
        for(String s: sec){
            for(String i:secv){
                if(s.equals(i)==true){
                    knt=knt+1;
                }
            }
        }
        jurnal=jurnal+"In secventa {";
        for(String i:secv){
            jurnal=jurnal+i+", ";
        }
        jurnal=jurnal +"} apar "+ knt +" siruri din secventa {";
        for(String s: sec){
            jurnal=jurnal+s+", ";
        }
        jurnal=jurnal +"}\n";
    }

    public String toString(){
        return jurnal;
    }
}

class StatisticaNonReale extends Statistica{

    public StatisticaNonReale(){
        super();
    }
    public void calculeaza(List<String> secv){
        int knt=0;
        for(String i:secv){
            try{
                double tmp=Double.parseDouble(i);
            }catch(NumberFormatException e){
                knt=knt+1;
            }
        }
        jurnal=jurnal+"In secventa {";
        for(String i:secv){
            jurnal=jurnal+i+", ";
        }
        jurnal=jurnal +"} avem "+ knt +" siruri ce nu sunt numere reale.\n";
    }
    public String toString(){
        return jurnal;
    }
}

class Executor{
    List<Statistica> list;

    public Executor(List<Statistica> list){
        this.list=list;
    }

    public void executa(List<String> secv){
        for(Statistica s:list){
            s.calculeaza(secv);
            System.out.println(s);
        }
    }
}

class Main{

    public static void main(String[] args){
        List<String> sec=new ArrayList<>();
        sec.add(new String("mere"));
        sec.add(new String("pere"));
        sec.add(new String("banane"));
        Statistica s1=new StatisticaNumarAparitii(sec);
        Statistica s2= new StatisticaNonReale();
        List<Statistica> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        Executor e1 = new Executor(list);

        List<String> ex1=new ArrayList<>();
        ex1.add(new String("Ana"));
        ex1.add(new String("pere"));
        ex1.add(new String("mere"));

        List<String> ex2=new ArrayList<>();
        ex2.add(new String("Maria"));
        ex2.add(new String("are"));
        ex2.add(new String("pere"));
        e1.executa(ex1);
        System.out.println("\n");
        e1.executa(ex2);
    }
}
