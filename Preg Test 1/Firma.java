class Firma {
    private String nume;
    private int buget;
    private Angajat[] angajati;
    private int numarAngajati;

    public Firma(String nume, int buget){
        this.nume=nume;
        this.buget=buget;
        this.angajati=new Angajat[30];
        this.numarAngajati=0;
    }
    public boolean adaugaAngajat(Angajat a){
        if(numarAngajati <30){
            for(int i=0;i<numarAngajati;i++)
            {
                if(angajati[i].equals(a))
                {
                    return false;
                }
            }
            angajati[numarAngajati++]=a;
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String s="" + nume +": ";
        for(int i=0;i<numarAngajati;i++)
        {
            s+=angajati[i] +" ";
        }
        return s;
    }
    private int getTotalSalarii(){
        int sum=0;
        for(int i=0;i<numarAngajati;i++){
            sum+=angajati[i].getSalar();
        }
        return sum;
    }
    public int platesteSalarii(){
        return buget-this.getTotalSalarii();
    }

}

class Angajat{
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu){
        this.nume=nume;
        this.salariu=salariu;
    }
    public String toString(){
        return nume +" - " + salariu;
    }
    public int getSalar(){
        return salariu;
    }
}

class Main{
    public static void main(String[] args){
        Firma f1=new Firma("Excalibur it sulutions",40000);
        Angajat a1=new Angajat("Marian",12000);
        Angajat a2=new Angajat("Lazar",4000);
        Angajat a3=new Angajat("Luca",28400);
        f1.adaugaAngajat(a1);
        f1.adaugaAngajat(a2);
        f1.adaugaAngajat(a3);
        f1.adaugaAngajat(a1);
        System.out.println(f1);
        System.out.println(f1.platesteSalarii());
    }
}
