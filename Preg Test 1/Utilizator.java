class Utilizator{
    private String nume;
    private String jurnal;

    public Utilizator(String nume){
        this.nume=nume;
        this.jurnal="";
    }
    public String getNume(){
        return nume;
    }

    public void receptioneaza(Utilizator u,String mesaj){
        this.jurnal+="Primit de la " + u.getNume() +" mesajul: " + mesaj +"\n";
    }

    public void trimite(Utilizator u,String mesaj){
        this.jurnal+="Trimis catre " + u.getNume() +" mesajul: "+ mesaj+"\n";
        u.receptioneaza(this,mesaj);
    }

    public void trimite(Grup g,String mesaj){
        this.jurnal+="Trimis catre " + g.getNume() +" mesajul: "+ mesaj+"\n";
        Utilizator[] util= g.getUtilizatori();
        for(int i=0;i<g.getNumarUtilizatori();i++){
            if(this.nume.equals(util[i].getNume())==false){
                util[i].receptioneaza(this,mesaj);
            }
        }
    }

    public String toString(){
        return nume + ": "+jurnal;
    }
}

class Main{
    public static void main(String[] args){
        Utilizator dan=new Utilizator("Dan");
        Utilizator alex=new Utilizator("Alex");
        Utilizator marius=new Utilizator("Marius");
        Grup carnivorii=new Grup("Carnivorii");
        carnivorii.inscrie(dan);
        carnivorii.inscrie(alex);
        carnivorii.inscrie(marius);
        carnivorii.inscrie(alex);
        System.out.println(carnivorii);
        alex.trimite(carnivorii,"Am deschis.");
        marius.trimite(carnivorii,"Vin acuma.");
        System.out.println(carnivorii);


    }
}





