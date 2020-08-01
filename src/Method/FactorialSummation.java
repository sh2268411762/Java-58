/**
 * 
 */
package Method;

import java.util.Scanner;

/**
*  @Description     阶乘求和
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月30日下午5:38:58
*/
public class FactorialSummation 
{
	public static int facSum(int num)//求和
	{
		int sum = 0;
		for(int i = 1;i <= num;i++)
		{
			int ret = fac(i);
			sum += ret;
		}
		return sum;
	}
	public static int fac(int num)//求阶乘
	{
		int ret = 1;
		for(int i = 1;i <= num;i++)
		{
			ret *= i;
		}
		return ret;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入操作数：");
		int n = sc.nextInt();
		int ret = facSum(n);
		System.out.println(ret);
		sc.close();
	}
}
