class Vocabular{
    private String[] cuvinte;
    private int numarDeCuvinte;
    public Vocabular(String cuvant){
        numarDeCuvinte =0;
        cuvinte=new String[1000];
            cuvinte[numarDeCuvinte++]=cuvant;
    }
    public void adaugaCuvinte(String[] cuv){
        if(numarDeCuvinte <1000)
        {
            for(int i=0;i<cuv.length && cuv[i]!=null && numarDeCuvinte <1000 ;i++)
            {
            cuvinte[numarDeCuvinte++]=cuv[i];

            }
        }
    }
    public int determinaDiferente(Vocabular v){
        int cnt=0;
        boolean ok= false;
        for(int i=0;i<v.numarDeCuvinte;i++)
        {
            for(int j=0;j<this.numarDeCuvinte;j++){
                if(v.cuvinte[i].equals(this.cuvinte[j])){
                    ok=true;
                    break;
                }
            }
            if(ok==false)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public String toString(){
        String s="";
        for(int i=0;i<numarDeCuvinte;i++)
            s=s+ cuvinte[i]+ " ";
        return s;
    }

}

class Main{

    public static void main(String[] args){

    Vocabular v1=new Vocabular("Marian");
    Vocabular v2=new Vocabular("Lucia");
    String[] nume2=new String[] {"Daniel","Teodora"};
    String[] nume=new String[] {"Robert", "Bianca","Radu","Daniela","Teodora"};
    v1.adaugaCuvinte(nume);
    v2.adaugaCuvinte(nume2);
    System.out.println(v1.determinaDiferente(v2));
    }
}
