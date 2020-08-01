/**
 * 
 */
package Method;

/**
*  @Description     方法重载：同一个名字，提供不同版本的实现（重载在一个类当中进行）
*  					1、方法名要相同  2、参数列表不同 （个数不同、类型不同、顺序不同）  3、返回值不做要求
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月1日下午10:00:34
*/
public class HeavyLoad 
{
	public static int add(int a,int b)
	{
		return a + b;
	}
	public static double add(double a,double b)
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println(add(a,b));
		double c = 10.8;
		double d = 20.7;
		System.out.println(add(c,d));
	}
}
