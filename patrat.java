class Patrat
{
	private int latura;
	
	public Patrat(int lat)
	{
		this.latura=lat;
	}
	public Patrat()
	{
		this.latura=10;
	}
	public String toString()
	{
		return "Patrat " + this.latura + " Aria " + (this.latura*this.latura);
	}

}

class Main
{
	public static void main(String[] args)
	{
		Patrat p1=new Patrat();
		Patrat p2=new Patrat(20);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}