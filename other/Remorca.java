class Remorca{
    private int nrCutii;
    private String nrInmatriculare;
    private static int nrCutiiAnterioare;
    public Remorca(int nrCutii, String nrInmatriculare)
    {
        this.nrCutii = nrCutii;
        this.nrInmatriculare = nrInmatriculare;
        this.nrCutiiAnterioare = nrCutii;
    }
    public int getNrCutii()
    {
        return this.nrCutii;
    }
    public String getNrInmatriculare()
    {
        return this.nrInmatriculare;
    }
    public Remorca(String nrInmatriculare)
    {
        if(nrCutiiAnterioare == 0)
            this.nrCutii = 10;
        else
            this.nrCutii = this.nrCutiiAnterioare + 1;
    }
}
