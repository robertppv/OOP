class Curs{
    private String denumire;
    private int id;
    private int codDeDiscipilna;
    private int numarCredite;

    public Curs(String denumire,int id,int codDeDiscipilna,int numarCredite){
        this.denumire=denumire;
        this.id=id;
        this.codDeDiscipilna=codDeDiscipilna;
        this.numarCredite=numarCredite;
    }

    public boolean equals(Object o){
        if(o instanceof Curs){
            if(this.codDeDiscipilna==o.codDeDiscipilna)
                return true;
            else
                return false;
        }
        else{
            return false;
        }
    }

    public int getCredite()
    {
        return this.numarCredite;
    }
    public int getId(){
        return this.id;
    }

    public String toString(){
    return id + " " + denumire + " " + numarCredite;
    }


}
