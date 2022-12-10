object factorial
{
	def Factorial(n:Int):Int=
	{
		var f=1;
		for(i<-1 to n)
		{
			f=f*i;
		}
		return f;
	}
	def main(args:Array[String])
	{
		println(Factorial(5));
	}
}
