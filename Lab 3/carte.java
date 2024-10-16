class Carte{
	private int numarPagini;
	
	public boolean equals(Object o)
	{
		if(o instanceof Carte )
		{
			return ((Carte)o).numarPagini == this.numarPagini;
		}
		else
		{
			return false;
		}
	}
	
	public Carte(int pagini)
	{
		this.numarPagini=pagini;
	}
	public String toString()
	{
		return "Carte "+ numarPagini;
	}
}

class Main{
	
	public static void main(String[] args)
	{
		Carte c1=new Carte(50);
		Carte c2=new Carte(52);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
	}
}