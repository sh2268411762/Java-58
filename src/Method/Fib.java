/**
 * 
 */
package Method;

/**
*  @Description     斐波那契数列
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午4:26:34
*/
public class Fib {
	public static int fib1(int n)
	{
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return fib1(n - 1) + fib1(n - 2);
	}
	public static int fib2(int n)
	{
		int f1 = 1,f2 = 1,f3 = 0;
		for(int i = 3;i <= n;i++)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
	public static void main(String[] args) 
	{
		int x = fib1(10);
		System.out.println(x);
		System.out.println(fib2(10));
	}
}
