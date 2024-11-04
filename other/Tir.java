class Tir{
    Remorca r[];
    public Tir() {
        r = new Remorca[5];
    }
    int nrRemorci;
    public boolean adaugaRemorca(int nrCutii, String nrInmatriculare){
        if(nrRemorci == 5)
            return false;
        else
        {
            Remorca aux = new Remorca(nrCutii, nrInmatriculare);
            r[nrRemorci] = aux;
            nrRemorci++;
            return true;
        }
    }
    public boolean adaugaRemorca(Remorca remorca)
    {
        if(nrRemorci == 5)
        {
            return false;
        }
        else
        {
            r[nrRemorci] = remorca;
            nrRemorci++;
            return true;
        }
    }
    public boolean equals(Object o)
    {
        if(o instanceof Tir)
        {
            int s1 = 0, s2 = 0;
            for(int i = 0; i < nrRemorci; i++)
                s1 += r[i].getNrCutii();
            for(int i = 0; i < ((Tir)o).nrRemorci; i++)
                s2 += ((Tir)o).r[i].getNrCutii();
            return s1 == s2;
        }
        else
            return false;

    }
    public String toString()
    {
        String s = "T->";
        for(int i = 0; i < nrRemorci; i++)
            s = s + "R" + i + "(" + r[i].getNrInmatriculare() + " " + r[i].getNrCutii()+ ")->";
        return s;
    }
}
