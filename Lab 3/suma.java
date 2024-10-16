class Suma
{
	
	public static int suma(int a, int b)
	{
		return a+b;
	}
	public static int suma(int a, int b, int c)
	{
		return suma(a,b)+c;
	}
	public static int suma(int a, int b, int c, int d)
	{
		return suma(a,b,c)+d;
	}
	
}

class Main
{
	public static void main(String[] args)
	{
		System.out.println(Suma.suma(1,2));
		System.out.println(Suma.suma(1,2,3));
		System.out.println(Suma.suma(1,2,3,4));
	}
}