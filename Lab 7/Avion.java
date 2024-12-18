import java.util.*;

 abstract class Avion{
    protected String planeId;
    protected int totalEnginePower;

    public String getPlaneId(){
        return planeId;
    }

    public int getTotalEnginePower(){
        return totalEnginePower;
    }

    public void takeOff(){
        System.out.println(planeId + "- Initiating takeo↵ procedure - Starting engines - Accelerating down the runway - Taking o↵ - Retracting gear - Takeo↵ complete " );
    }

    public void fly(){
        System.out.println(planeId+ "- Flying");
    }
    public void land(){
        System.out.println(planeId +"- Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
    public Avion(String planeId,int totalEnginePower){
        this.planeId=planeId;
        this.totalEnginePower=totalEnginePower;
    }
}

 abstract class AvionCalatori extends Avion{
    private int maxPassengers;

    public int getMaxPassengers(){
        return maxPassengers;
    }

    public AvionCalatori(int maxPassengers,int totalEnginePower,String planeId){
        super(planeId,totalEnginePower);
        this.maxPassengers=maxPassengers;
    }
}

class Concorde extends AvionCalatori{

    public void goSuperSonic(){
        System.out.println(planeId+"- Supersonic mode activated");
    }
    public void goSubSonic(){
        System.out.println(planeId + "- Supersonic mode deactivated");
    }

    public Concorde(int maxPassengers,int totalEnginePower,String planeId){
        super(maxPassengers,totalEnginePower,planeId);
    }
}

class Boeing extends AvionCalatori{
    public Boeing(int maxPassengers,int totalEnginePower,String planeId){
        super(maxPassengers,totalEnginePower,planeId);
    }
}

abstract class AvionLupta extends Avion{
    public void launchMissile(){
        System.out.println(planeId +"- Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }

    public AvionLupta(int totalEnginePower,String planeId){
        super(planeId,totalEnginePower);
    }
}

class Mig extends AvionLupta{
    public void highSpeedGeometry(){
        System.out.println(planeId +"- High speed geometry selected ");
    }
    public void normalGeometry(){
        System.out.println(planeId +"- Normal geometry selected ");
    }
    public Mig(String planeId, int totalEnginePower ){
        super(totalEnginePower,planeId);
    }
}

class TomCat extends AvionLupta{

    public void refuel(){
        System.out.println(planeId +"- Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
    public TomCat(String planeId, int totalEnginePower ){
        super(totalEnginePower,planeId);
    }
}

class Main{

    public static void main(String[] args){
        ArrayList<Avion> avioane = new ArrayList<>();
        Avion a1=new Mig("Mig1",1000);
        Avion a2=new TomCat("TOM1",5000);
        Avion a3= new Boeing(400,2000,"BOE1");
        Avion a4=new Concorde(500,20000,"Con1");

        avioane.add(a1);
        avioane.add(a2);
        avioane.add(a3);
        avioane.add(a4);
        Iterator t=avioane.iterator();
        while(t.hasNext()){
            Avion a= (Avion)t.next();
            a.fly();
        }
    }
}
