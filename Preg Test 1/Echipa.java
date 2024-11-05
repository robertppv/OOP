class Echipa{
    private Jucator[] titulari;
    private Jucator[] rezerve;

    public Echipa(Jucator[] titulari, Jucator[] rezerve){
        this.titulari=titulari;
        this.rezerve=rezerve;
    }

    public boolean efectueazaSchimbare(Jucator titular, Jucator rezerva){
        boolean okTitular=false;
        boolean okRezerva=false;
        int indexTitular=0;
        int indexRezerva=0;
        int i=0;
        for(i=0;i<titulari.length;i++)
        {
            if(titulari[i].equals(titular))
            {
                okTitular=true;
                 indexTitular=i;
                break;
            }
        }
        for(i=0;i<rezerve.length;i++)
        {
            if(rezerve[i].equals(rezerva))
            {
                okRezerva=true;
                indexRezerva=i;
                break;
            }
        }
        if(!(okTitular && okRezerva))
            return false;

        titulari[indexTitular]=rezerva;
        rezerve[indexRezerva]=titular;
        return true;
    }



    public String toString(){
        String s="Titulari: ";
        int i=0;
        for(i=0;i<titulari.length;i++)
        {
            s=s+ titulari[i] +" ";
        }
        s+="; Rezerva:";
        for(i=0;i<rezerve.length;i++)
        {
            s+=rezerve[i] +" ";
        }
        return s;
    }
}

class Jucator{
    private String nume;
    private int numar;

    public Jucator(String nume,int numar){
        this.numar=numar;
        this.nume=nume;
    }
    public String getNume(){
        return nume;
    }
    public int getNumar(){
        return numar;
    }
    public String toString(){
        return "("+nume +", " + numar+")";
    }

    public boolean equals(Object o){
        if(o instanceof Jucator)
        {
            return (this.numar == ((Jucator)o).getNumar()) &&(this.nume.equals(((Jucator)o).getNume()));
        }
        else
        {
            return false;
        }
    }
}
class Main{

    public static void main(String[] args){
        Jucator j1=new Jucator("Robert",7);
        Jucator j2=new Jucator("Robi",5);
        Jucator j3=new Jucator("laori",9);
        Jucator j4=new Jucator("marica",3);
        Jucator[] titulari ={j1,j2};
        Jucator[] rezerve ={j3,j4};
        Echipa e1=new Echipa(titulari,rezerve);
        System.out.println(e1);
        e1.efectueazaSchimbare(j1,j4);
        System.out.println(e1);

    }
}
