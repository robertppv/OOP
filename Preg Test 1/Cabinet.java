class Cabinet{
    private String nume;
    private int numarCazuri;
    private String[] cazuri;

    public Cabinet(String nume){
    this.nume=nume;
    this.numarCazuri=0;
    cazuri=new String[40];
    }

    public void adaugaCaz(String reclamat, String acuzat){
        if(numarCazuri < 40)
        {
            cazuri[numarCazuri++]=reclamat + " vs. " + acuzat;
        }
    }

    public Cabinet formeazaAlianta(Cabinet c){
        if(this.numarCazuri + c.numarCazuri <=40){
            Cabinet newCabinet= new Cabinet(this.nume + " - " + c.nume);

            newCabinet.numarCazuri=this.numarCazuri+ c.numarCazuri;
            for(int i=0;i<this.numarCazuri;i++)
            {
                newCabinet.cazuri[i]=this.cazuri[i];
            }
            for(int j=0;j<c.numarCazuri;j++)
            {
                newCabinet.cazuri[j+this.numarCazuri]=c.cazuri[j];
            }

            return newCabinet;
        }else{
            return null;
        }
    }
    public String toString(){
        String s="";

        s=s+nume +"\n";
        for(int i=0;i<numarCazuri;i++)
            s=s+cazuri[i]+"\n";

        return s;
    }

}

class Main{

    public static void main(String[] args){

    Cabinet c=new Cabinet("Popovici Robert si asociatii");
     Cabinet c2=new Cabinet("Popovici Lucia Bianca si asociatii");
    c.adaugaCaz("Lucia","Anaf");
    c.adaugaCaz("marian","Anaf");
    c2.adaugaCaz("marian","teo");
    System.out.println(c);
    System.out.println(c2);
    Cabinet c3= c.formeazaAlianta(c2);
    System.out.println(c3);

    }
}




