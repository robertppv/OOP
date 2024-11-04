class Desen{
    private String titlu;
    private Figura[] figuri;
    private int numarFiguri;

    public Desen(String titlu){
        this.titlu=titlu;
        this.figuri=new Figura[1024];
        this.numarFiguri=0;
    }
    public boolean adaugaFigura(Figura f){
        if(numarFiguri < 1024){
            for(int i=0;i<numarFiguri;i++){
                if(figuri[i].equals(f))
                    return false;
            }
            figuri[numarFiguri++]=f;
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String s="" + titlu +": ";
        for(int i=0;i<numarFiguri;i++){
            s+=figuri[i] +" ";
        }
        return s;
    }
    private float getArieTotal(){
        float s=0;
        for(int i=0;i<numarFiguri;i++){
            s+=figuri[i].getArie();
        }
        return s;
    }
    public float medieArie(){
        if( numarFiguri ==0 )
        {
            return 0;
        }else
        {
            return this.getArieTotal()/numarFiguri;
        }

    }
}
class Figura{
    private float arie;
    public Figura(float arie){
        this.arie=arie;
    }
    public float getArie(){
        return arie;
    }

    public String toString(){
        return "Figura - Arie: " + arie;
    }
}

class Main{
    public static void main(String[] args){
        Desen d1=new Desen("apusul");
        Figura f1= new Figura(23.4f);
        Figura f2= new Figura(67);
        Figura f3= new Figura(1.6f);
        d1.adaugaFigura(f1);
        d1.adaugaFigura(f2);
        d1.adaugaFigura(f3);
        d1.adaugaFigura(f1);
        System.out.println(d1);
        System.out.println(d1.medieArie());
    }
}
