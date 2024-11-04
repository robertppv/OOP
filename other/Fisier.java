class Fisier{
    private String nume;
    private String continut;
    private int id;
    private static int cnt;
    private static int nrConcatenari;
    Fisier fisierAnterior;
    public Fisier(String nume, String continut)
    {
        this.nume = nume;
        this.continut = continut;
        this.id = cnt + 1;
    }
    public void salveazaVersiune()
    {
        Fisier f = new Fisier(this.nume+"bak", this.continut);
        Fisier aux;
        aux = this.fisierAnterior;
        this.fisierAnterior = f;
        f.fisierAnterior = aux;
    }
    public void concateneaza(Fisier f)
    {
        nrConcatenari++;
        salveazaVersiune();
        this.continut = this.continut + f.continut;
    }
    public int numarConcatenari()
    {
        return nrConcatenari;
    }
    public String toString()
    {
        return  this.id + this.nume + this.continut + this.fisierAnterior;
    }
}
