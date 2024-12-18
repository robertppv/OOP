class Punct{
    private int x;
    private int y;
    public Punct(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class PunctColorat extends Punct {
    private String c;
    public PunctColorat(int x,int y,String c){
        super(x,y);
        this.c=c;
    }

}
