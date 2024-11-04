class Masina{
    private String numarInmatriculare;
    private int cantitateBenzina;

    public Masina(String numarInmatriculare,int cantitateBenzina){
        this.numarInmatriculare=numarInmatriculare;
        this.cantitateBenzina=cantitateBenzina;
    }

    public int getCantitateBenzina(){
        return cantitateBenzina;
    }

    public String toString(){
        return numarInmatriculare + " - " + cantitateBenzina;
    }
}

class Main{

    public static void main(String[] args){

    Benzinarie b1=new Benzinarie();
    Masina m1=new Masina("TM24TLB", 5);
    Masina m2=new Masina("TM07ALO", 10);
    Masina m3=new Masina("TM97MIH", 15);
    b1.alimenteazaMasina(m1);
    b1.alimenteazaMasina(m2);
    b1.alimenteazaMasina(m3);
    System.out.println(b1);
    b1.alimenteazaBenzinarie(15);
    System.out.println(b1);
    }
}
