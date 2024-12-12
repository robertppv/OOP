import java.util.Random;
import java.util.Date;

class CoordinateGenerator {
    private Random randomGenerator;
    public CoordinateGenerator() {
        Date now = new Date();
        long sec = now.getTime();
        randomGenerator = new Random(sec);
    }
    public int generateX() {
        int x = randomGenerator.nextInt(101);
        if(x < 5) {
            x = 0;
        } else if(x > 95) {
            x = 100;
        } else {
            x = randomGenerator.nextInt(99) + 1;
        }
        return x;
    }
    public int generateY() {
        int y = randomGenerator.nextInt(101);
        if(y < 5) {
            y = 0;
        } else if(y > 95) {
            y = 50;
        } else {
            y = randomGenerator.nextInt(49) + 1;
        }
        return y;
    }
}


class GolException extends Exception{
    public GolException(String message){
        super(message);
    }
}

class OutException extends Exception{
    public OutException(String message){
        super(message);
    }
}
class CornerException extends Exception{
    public CornerException(String message){
        super(message);
    }
}




class Minge{
    private int x;
    private int y;
    private CoordinateGenerator gen;

    public Minge(int x,int y){
        this.gen=new CoordinateGenerator();
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void suteaza() throws GolException,OutException,CornerException{

        x=gen.generateX();
        y=gen.generateY();
        if(y == 0 || y== 50){
            throw new OutException("Mingea este in out!");
        }else if((x==0 || x==100) && y >=20 && y <=30){
            throw new GolException("Gol");
        }else if((x==0 || x==100) && ((y <20 && y>0 )||(y >30 && y<50) )){
            throw new CornerException("Corner");
        }

    }
    public String toString(){
        return x + " " + y;
    }
}


class Echipa{
    private String nume;
    private int numarGoluri;
    public Echipa(String nume){
        this.nume=nume;
    }

    public void marcheazaGol(){
        numarGoluri++;
    }

    public String toString(){
        return nume +":" + numarGoluri;
    }
}


class Joc{
    private Minge minge;
    private Echipa e1;
    private Echipa e2;
    private int numarOut;
    private int numarCorner;
    private CoordinateGenerator gen;

    public Joc(String nume1,String nume2){
        this.gen=new CoordinateGenerator();
        this.e1=new Echipa(nume1);
        this.e2=new Echipa(nume2);
        this.minge=new Minge(gen.generateX(), gen.generateY());
    }

    public void simuleaza(){
    for(int i=0;i<10;i++){
    try{
    System.out.println("Mingea se afla la coordonatele"+ " ("+minge.getX() +"," + minge.getY() +")");
        minge.suteaza();
    }
    catch(GolException e){
        if(minge.getX()==0){
        e2.marcheazaGol();
        }else{
        e1.marcheazaGol();
        }

        minge= new Minge(50,25);
        System.out.println(e);


    }
    catch(CornerException e){
        numarCorner++;

        if(minge.getY()<20){
        minge=new Minge(minge.getX(),0);
        }else{
        minge=new Minge(minge.getX(),100);
        }

        System.out.println(e);
    }
    catch(OutException e){

        minge=new Minge(minge.getX(),minge.getY());
        System.out.println(e);
        numarOut++;
    }

    }
    }
    public String toString(){
    return e1 +" "+ e2 + " " + numarOut +" "+ numarCorner;
    }

}

class Main{
    public static void main(String[] args){

    Joc joc1=new Joc("Dumbravita","Arad");
    joc1.simuleaza();
    System.out.println(joc1);
    }
}
