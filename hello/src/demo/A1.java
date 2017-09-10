package demo;



class Test1 
{
	static void print()
	{
		System.out.println("inside static");
	}
	
}
class Demo
{
 static void display()
	{
		System.out.println("inside demo static");
	}
 public static void main(String[] args) {
		{
			Test1.print();
			display();
		}
}
}
