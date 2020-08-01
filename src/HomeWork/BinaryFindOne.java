/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     寻找一个数的二进制中1的位数
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午9:03:26
*/
public class BinaryFindOne 
{
	private static int findOne(int n)
	{
		int sum = 0;
		while(n > 0)
		{
			if((n & 1) == 1)
			{
				sum++;
			}
			n >>>= 1;
		}
		return sum;
	}
	private static int fun(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			sum++;
			n = n & (n - 1);
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入操作数：");
		int num = sc.nextInt();
		int ret = findOne(num);
		System.out.println(num + "的二进制中1的个数为" + ret);
		sc.close();
	}
}
