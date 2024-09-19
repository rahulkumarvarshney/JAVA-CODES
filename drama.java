class buffer
{
int x;
int y;
int c;
void add()
{
x=20;
y=10;
System.out.println(x);
System.out.println(y);
}
}


class soft extends buffer
{
	
void subt()
{
System.out.println(y);
}
}


class drama
{
	public static void main(String args[])
	{
		soft re=new soft();
		re.add();
		re.subt();
	}
}

