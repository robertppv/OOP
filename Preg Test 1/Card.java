class Card{
    private String numar;
    private float sold;

    public Card(String numar, float sold)
    {
        this.numar=numar;
        this.sold=sold;
    }
    public String getNumar(){
        return numar;
    }
    public float getSold(){
        return sold;
    }
    public String toString(){
        return numar + " - " +sold;
    }
}

class Portofel{
    private String numeProprietar;
    private Card[] carduri;
    private int numarCarduri;

    public Portofel(String numeProprietar){
        this.numeProprietar=numeProprietar;
        this.carduri=new Card[6];
        this.numarCarduri=0;
    }
    public boolean adaugaCard(String numar,float sold){
        if(numarCarduri<6){
            for(int i=0;i<numarCarduri;i++){
                if(numar.equals(carduri[i].getNumar()))
                {
                    return false;
                }
            }
            carduri[numarCarduri++]=new Card(numar,sold);
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String s="Portofel " + numeProprietar +":";
        for(int i=0;i<numarCarduri;i++)
        {
            s+= carduri[i]+ " ";
        }
        return s;
    }
    public float calculeazaSold(){
        float sum=0;
        for(int i=0;i<numarCarduri;i++)
        {
            sum+=carduri[i].getSold();
        }
        return sum;
    }

}

class Main{
    public static void main(String[] args){
        Portofel p1=new Portofel("Robert Popovici");
        p1.adaugaCard("123", (float) 23.5);
        p1.adaugaCard("456",(float) 45.5);
        p1.adaugaCard("789",60);
        p1.adaugaCard("123",44);
        System.out.println(p1);
        System.out.println(p1.calculeazaSold());
    }
}
