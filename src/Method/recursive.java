/**
 * 
 */
package Method;

/**
*  @Description     递归
*  					将大问题化解成小问题————1、调用本身 2、要有一个趋近于终止的条件
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月1日下午10:11:43
*/
public class recursive 
{
	public static int fac(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * fac(n - 1);
	}
	public static void fun(int n)
	{
		if(n < 0)
		{
			n = -n;
		}
		if(n > 9)
		{
			fun(n / 10);
		}
		System.out.print(n % 10 + " ");
	}
	public static int add(int n)
	{
		if(n <= 0)
		{
			return 0;
		}
		return n + add(n - 1);
	}
	public static int func(int n)
	{
		if(n < 0)
		{
			n = -n;
		}
		if(n < 10)
		{
			return n;
		}
		else
		{
			return n % 10 + func(n/10);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(fac(5));
		fun(1234);
		System.out.println("\n10+9+8+...+2+1 = " + add(10));
		System.out.println(func(1792));
	}
}	
