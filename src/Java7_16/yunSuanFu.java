/**
 * 
 */
package Java7_16;

/**
*  @Description     运算符
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月24日上午12:45:44
*/
public class yunSuanFu 
{
	public static void main(String[] args) 
	{
		//int   ---> String
		int a = 10;
		String str1 = a + "";
		System.out.println(str1);
		String str2 = String.valueOf(a);
		System.out.println(str2);
		
		//Strint --->int
		String str3 = "7654";
		int b = Integer.parseInt(str3);
		System.out.println(b);
	}
	public static void main2(String[] args) 
	{
		int a = 10;
		double b = 20;
		a = (int)b;        //错误，大类型转换为小类型需要强转
		b = a;             //小类型可以直接转为大类型，不强转
	}
	public static void main1(String[] args) 
	{
		int a = 10;         //变量
		a = 99;             //可以被修改
		final int b = 20;   //常量
//		b = 99;             //错误，不可被改变
		int c = a + 10;
		int d = b + 30;
		
	}
}
