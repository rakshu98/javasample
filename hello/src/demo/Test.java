package demo;

public class Test {
	Test()
	{
		System.out.println("Default const");
	}
	Test(int a,int b)
	{
		System.out.println("parameterised cons");	
	}
	public static void main(String[] args) {
		Test T=new Test();
		Test T1=new Test(2,3);
		
	}

}
