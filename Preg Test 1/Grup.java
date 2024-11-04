class Grup{
    private String nume;
    private Utilizator[] utilizatori;
    private int numarUtilizatori;

    public Grup(String nume){
        this.nume=nume;
        this.utilizatori=new Utilizator[10];
        this.numarUtilizatori=0;
    }
    public Utilizator[] getUtilizatori(){
        return utilizatori;
    }

    public String getNume(){
        return nume;
    }

    public int getNumarUtilizatori(){
        return numarUtilizatori;
    }

    public void inscrie(Utilizator u){
        boolean ok=false;
        for(int i=0;i<numarUtilizatori;i++)
        {
            if(utilizatori[i].getNume().equals(u.getNume()))
            {
                ok=true;
                break;
            }
        }
        if(ok){
            System.out.println("UtilizatorDublicat");
        }else{
            utilizatori[numarUtilizatori++]=u;
        }
    }

    public String toString(){
        String s="";
        for(int i=0;i<numarUtilizatori;i++)
            s+=utilizatori[i] +"\n";
        return s;
    }


}
