class Carte
{
    private int nrPagini;
    public Carte(int nrPagini)
    {
        this.nrPagini = nrPagini;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Carte)
        {
            if(this.nrPagini == ((Carte)o).nrPagini)
                return true;
            return false;
        }
        else
            return false;
    }
}
