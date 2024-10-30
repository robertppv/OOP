import java.io.*;
import java.util.Random;

class Main{

public static void main(String[] args){
   int numarTelefone;
   Random rnd=new Random();
   int A;
   String nume;
   int i;

   try{
   BufferedReader in_stream_char = new BufferedReader(new InputStreamReader(System.in));

    numarTelefone=Integer.parseInt(in_stream_char.readLine());
    Telefon[] telefoane=new Telefon[numarTelefone];

    for( i=0;i<numarTelefone;i++)
    {
     System.out.println("Nume proprietar telefon "+(i+1));
     telefoane[i]=new Telefon(in_stream_char.readLine());
    }
     System.out.println("A:");
     A= Integer.parseInt(in_stream_char.readLine());

     for(i=0;i<A;i++)
     {
        telefoane[rnd.nextInt(numarTelefone)].apeleaza(telefoane[rnd.nextInt(numarTelefone)]);
     }
     System.out.println("Nume:");
     nume= in_stream_char.readLine();

     for( i=0;i<numarTelefone;i++)
    {
     System.out.println(telefoane[i]+" " +telefoane[i].numarDeApeluri(nume));
    }



   }catch(IOException e){
    System.exit(1);
   }

}

}
