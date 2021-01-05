
public class SamplePrg 
{
	String name;
	int id;
	double salary;
	public SamplePrg(String name ,int id , double salary) 
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}

		private void Info() 
		{
			System.out.println(name+""+id+""+salary);
		}
		private void Info1() 
		{
			System.out.println(name+""+id+""+salary);
		}
		public static void main(String[] args) 
		{
			SamplePrg s1=new SamplePrg("Sadik", 2130, 213.00);
			s1.Info();
			s1.Info1();
			
			
		}
}
