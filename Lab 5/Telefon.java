class Telefon{
    private String numeProprietar;
    private String[] numeApelat;
    private int numarApelanti;


    public  Telefon(String numeProprietar){
        this.numeProprietar=numeProprietar;
        numeApelat=new String[10];

    }

    public String getNumePropritar(){
        return numeProprietar;
    }

    public int getNumarApelanti(){
        return numarApelanti;
    }

    public boolean apeleaza(Telefon t){
        if(t.getNumarApelanti() ==99 || this.equals(t)){
            return false;
        }
        else{
            t.numeApelat[t.numarApelanti++]=this.numeProprietar;
            return true;
        }
    }

    public Integer numarDeApeluri(String nume){
        int cnt=0;
        for(int i=0;i<this.getNumarApelanti();i++){
            if(numeApelat[i].equals(nume)){
                cnt++;
            }
        }
        return Integer.valueOf(cnt);
    }

    public String toString(){
        String s="";
        s=s+this.getNumePropritar();
        for(int i=0;i<this.getNumarApelanti();i++){
            s=s+" " + numeApelat[i];
        }
        return s;
    }










}
