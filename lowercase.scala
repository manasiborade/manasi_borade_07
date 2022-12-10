object lowercase
{
	def main(args:Array[String])
	{
		var a="";
		println("enter the string");
		a=scala.io.StdIn.readLine();
		
		var n=a.length();
			
		var cnt=0;
		for(i<-0 to n)
		if(a(i)>='A'&& a(i)<='Z')
		{
			cnt+=1;
		}
		println("upper case  letter count:" +cnt);
		println("lowercase :" +a.toLowerCase());
	}
}
