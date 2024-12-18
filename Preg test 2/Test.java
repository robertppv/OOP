import java.util.*;



class WrongQualityIndicatorException extends RuntimeException{
    public WrongQualityIndicatorException(String msg){
        super(msg);
    }
}
class WrongComponentComplexityException extends RuntimeException{
    public WrongComponentComplexityException(String msg){
        super(msg);
    }
}

interface ITest{
    public int getNumarTeste();
}
abstract class Test implements ITest{

}

abstract class TestSimplu extends Test{
    protected String nume;
    protected  int indicatorCalitate;

    public TestSimplu(String nume,int indicatorCalitate) throws WrongQualityIndicatorException{
        if(indicatorCalitate < 1 || indicatorCalitate >10){
            throw new WrongQualityIndicatorException("Indicatorul nu se incadreaza in intervalul [1, 10]");
        }
        this.nume=nume;
        this.indicatorCalitate=indicatorCalitate;
    }

}

class IntegrationTest extends TestSimplu{


    public IntegrationTest(String nume,int indicatorCalitate) throws WrongQualityIndicatorException{
        super(nume,indicatorCalitate);
    }
    public int getNumarTeste(){
        return 1;
    }

    public String toString(){
        return "IntegrationTest(name= "+ nume +", quality indicator= "+ indicatorCalitate +")";
    }
}

class ComponentTest extends TestSimplu{
    private int complexitate;
    public ComponentTest(String nume,int indicatorCalitate,int complexitate) throws WrongQualityIndicatorException, WrongComponentComplexityException{
        super(nume,indicatorCalitate);
        if(complexitate != (int)complexitate || complexitate<=0){
            throw new WrongComponentComplexityException("Complexitatea nu este buna");
        }
        this.complexitate=complexitate;


    }

    public int getNumarTeste(){
        return 1;
    }

    public String toString(){
        return "ComponentTest(name= "+ nume +", quality indicator= "+ indicatorCalitate +", component complexity indicator= " + complexitate +")";
    }
}

class TestSuite extends Test{
    List<Test> teste;

    public TestSuite(){
        teste = new ArrayList<Test>();
    }

    public boolean addNewIntegrationTest(String name,int indicatorCalitate){
        try{
            Test tmp=new IntegrationTest(name,indicatorCalitate);
            teste.add(tmp);
            return true;
        }catch(WrongQualityIndicatorException e){
            return false;
        }
    }

    public boolean addNewComponentTest(String name,int indicatorCalitate, int indicator )throws WrongComponentComplexityException{
        try{
            Test tmp=new ComponentTest(name,indicatorCalitate,indicator);
            teste.add(tmp);
            return true;
        }catch(WrongQualityIndicatorException E){
            return false;
        }
    }

    public int getNumarTeste(){
        return teste.size();
    }

    public String toString(){
        String s="TestSuite(";
        for(Test t:teste){
            s=s+t +" ";
        }
        s=s+")";
        return s;
    }
}

class Main{

    public static void main(String[] args){
        TestSuite ts=new TestSuite();
        try{
            ts.addNewComponentTest("Caca",6,0);
            System.out.println(ts);
        }catch(WrongComponentComplexityException e){
            System.out.println(e);
        }
    }
}
