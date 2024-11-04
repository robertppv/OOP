class Curicula{
    private Curs[] cursuri;
    private int numarCursuri;

    public Curicula(){
    cursuri = new Cursuri[100];
    numarCursuri=0;
    }

    public void add(Curs c){
        if(numarCursuri==cursuri.length()){
            private Curs[] temp = new Cursuri[2*numarCursuri];

        for(int i=0;i<numarCursuri;i++)
            temp[i]=cursuri[i];

        cursuri=temp;
        cursuri[numarCursuri++]=c;

        }
        else{
            cursuri[numarCursuri++]=c;
        }
    }

    public Curs cauta(int id){
        for(int i=0;i<numarCursuri;i++)
        {
            if(cursuri[i].getId()==id)
                return cursuri[i];
        }
        return null;

    }

    public String toString(){
        String s="";
        for(int i=0;i<numarCursuri;i++)
            s = s + cursuri[i] + "\n";
        return s;
    }




}
