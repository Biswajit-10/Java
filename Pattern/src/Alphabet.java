class Alphabet 
{
static void alphabet()
	{
		char ch='b';
        String s=(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')?"alphabet":ch>='0'&&ch<='9'?"digit":"special character";
		System.out.println(s);
	}
public static void main(String[] args)
{
 alphabet();
}
}
