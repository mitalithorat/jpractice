class person
{	
	void show()
	{
		System.out.println("show method in person class");
	}
}
class students extends person
{	
	void show()
	{
		System.out.println("show method in student class");
	}

void display()
{
	
		System.out.println("show method in student class");
		super.show();
}
}
class prog1
{
	public static void main(String a[])
{
	students s=new students();
	s.display();
}
}