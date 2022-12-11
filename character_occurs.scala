object character_occurs
{
	def main(args:Array[String])
	{
		var a="";
		var c=' ';
		println("enter the string");
		a=scala.io.StdIn.readLine();
		println("enter the character");
		c=scala.io.StdIn.readChar();
		var n=a.length();	
		var cnt=0;
		for(i<-0 to n-1)
		if(a(i)==c)
		{
			cnt+=1;
		}
		println("character:" +c ,"occurs:" +cnt);
	}
}
