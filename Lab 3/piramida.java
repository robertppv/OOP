class Piramida
{
	private int n;
	
	public Piramida(int n)
	{
		this.n=n;
	}
	
	public String toString()
	{
		int c=1;
		String temp="";
		for(int i=n;i>1;i--)
		{
			int j=1;
			temp+=c;
			while(j<i)
			{
				temp=temp + " "+ c;
				j++;
			}
			temp=temp+"\n";
			c++;
		}	
		temp+=c;
		return temp;
	}
	
}

class Main
{
	public static void main(String[] args)
	{
		Piramida p1=new Piramida(9);
		System.out.println(p1);
	}
}
