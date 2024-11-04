class Benzinarie{
    private int cantitateBenzinaDisponibila;
    private Masina[] masini;
    private int numarMasini;

    public Benzinarie(){
        this.cantitateBenzinaDisponibila=0;
        this.masini=new Masina[10];
        this.numarMasini=0;
    }

    public boolean alimenteazaMasina(Masina m){
        if(m.getCantitateBenzina()<=cantitateBenzinaDisponibila){
            cantitateBenzinaDisponibila-=m.getCantitateBenzina();
            return true;
        }
        else{
            if(numarMasini<10)
            {
                for(int i=numarMasini-1;i>=0;i--){
                    masini[i+1]=masini[i];
                }
                masini[0]=m;
                numarMasini++;
                return true;
            }else{
                return false;
            }
        }

    }

    public String toString(){
        String s="Coada benzinarie: ";

        for(int i=0;i<numarMasini;i++)
        {
            s=s+masini[i] + " ";
        }
        return s;
    }

    public void alimenteazaBenzinarie(int cantitateCombustibil){
        this.cantitateBenzinaDisponibila+=cantitateCombustibil;
        for(int i=numarMasini-1;i>=0;i--){
            if(cantitateBenzinaDisponibila >= masini[i].getCantitateBenzina())
            {
                cantitateBenzinaDisponibila-=masini[i].getCantitateBenzina();
                masini[numarMasini--]=null;
            }
            else{
                break;
            }
        }
    }
}


