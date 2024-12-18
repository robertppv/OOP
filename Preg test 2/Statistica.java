import java.util.*;

class DestinatarDuplicat extends Exception{

    public DestinatarDuplicat(String nume){
        super(nume +" este deja in grup.");
    }
}
abstract class  Destinatar{
    private String nume;
    public abstract void receptioneaza(Utilizator u,String msj);
    public String getName(){
        return nume;
    }

    public Destinatar(String nume){
        this.nume=nume;
    }

    public boolean equals(Object o){
        if(o instanceof Destinatar){
            if(nume.equals(((Destinatar)o).getName())==true)
                return true;
                else{
                    return false;
                }
        }else{
            return false;
        }
    }
}

class Utilizator extends Destinatar{
    private String jurnal;

    public Utilizator(String nume){
        super(nume);
        this.jurnal="";
    }

    public void trimite( Destinatar d,String msj){
        jurnal =jurnal +"Trimis catre " + d.getName() + " mesajul: " + msj +"\n";
        d.receptioneaza(this,msj);

    }

    public void receptioneaza(Utilizator t,String msj){
        jurnal =jurnal + "Primit de la "+ t.getName() + " mesajul: "+ msj +"\n";
    }

    public String toString(){
        String s="Nume: ";
        s=s+getName()+"\n" + "Jurnal:\n" + jurnal;
        return s;
    }
}

class Grup extends Destinatar{
    List<Destinatar> participanti;

    public Grup(String nume){
        super(nume);
        participanti = new ArrayList<Destinatar>();
    }

    public void inscrie(Destinatar d) throws DestinatarDuplicat {
        for(Destinatar t :  participanti){
            if(d.equals(t) == true){
                throw new DestinatarDuplicat(d.getName());
            }
        }
        participanti.add(d);
    }
    public void receptioneaza(Utilizator u,String msj){
        for(Destinatar t :  participanti){
            if(u.equals(t) == false){
                t.receptioneaza(u,msj);
            }
        }
    }
}

class Main{


    public static void main(String[] args){
        Utilizator alex=new Utilizator("Alex");
        Utilizator marius=new Utilizator("Marius");
        Utilizator dan=new Utilizator("Dan");
        Grup g1=new Grup("Carnivorii");
        try{
            g1.inscrie(alex);
            g1.inscrie(marius);
            g1.inscrie(dan);
            g1.inscrie(alex);

        }catch(DestinatarDuplicat e){
            System.out.println(e);
        }
        alex.trimite(g1,"Am deschis magazinul");
        marius.trimite(g1,"Vin acuma");
        System.out.println(alex);
        System.out.println(marius);
        System.out.println(dan);
    }
}
