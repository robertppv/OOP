class Meniu{
    private int numarCaloriiMaxim;
    private FelDeMancare[] feluriDeMancare;
    private int numarFeluriDeMancare;


    public Meniu(int numarCalorii){
        this.numarCaloriiMaxim=numarCalorii;
        this.feluriDeMancare=new FelDeMancare[10];
        this.numarFeluriDeMancare=0;
    }
    public int getNumarCalorii(){
        int sum=0;
        for(int i=0;i<numarFeluriDeMancare;i++)
            {
                sum+=feluriDeMancare[i].getCalorii();
            }
        return sum;
    }
    public boolean adaugaFelDeMancare(FelDeMancare mancare){
        int sum=0;
        if(numarFeluriDeMancare <10 && (this.getNumarCalorii() + mancare.getCalorii() )<=numarCaloriiMaxim )
        {
            feluriDeMancare[numarFeluriDeMancare++]=mancare;
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String s="Meniu cu maxim "+numarCaloriiMaxim +" calorii: ";
        for(int i=0;i<numarFeluriDeMancare;i++)
            s+=feluriDeMancare[i] + " ";
        return s;
    }

    public boolean schimbaFelDeMancare(FelDeMancare mancare){
        for(int i=0;i<numarFeluriDeMancare;i++)
        {
            if(this.feluriDeMancare[i].getCalorii() == mancare.getCalorii())
            {
                this.feluriDeMancare[i]=mancare;
                return true;
            }
        }
        return false;
    }
}

class Main{

    public static void main(String[] args){
    Meniu m1=new Meniu(2500);
    FelDeMancare f1=new FelDeMancare("avo toast",500);
    FelDeMancare f2=new FelDeMancare("Big Mac Menu",1000);
    FelDeMancare f3=new FelDeMancare("Steak and fries",1000);
    FelDeMancare f4=new FelDeMancare("peanut butter jelly",500);
    m1.adaugaFelDeMancare(f1);
    m1.adaugaFelDeMancare(f2);
    m1.adaugaFelDeMancare(f3);
    System.out.println(m1);
    m1.schimbaFelDeMancare(f4);
    System.out.println(m1);

    }
}
