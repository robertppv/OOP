class FelDeMancare{
    private String denumire;
    private int calorii;

    public FelDeMancare(String denumire, int calorii){
        this.denumire=denumire;
        this.calorii=calorii;
    }

    public int getCalorii()
    {
        return calorii;
    }

    public String toString(){
        return denumire + " - " + calorii;
    }
}
