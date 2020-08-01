/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     求一个数二进制序列中所有的偶数位和奇数位，并输出二进制序列
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午9:10:50
*/
public class Binary 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入操作数：");
		int num = sc.nextInt();
		int i = 0;
		//偶数
		System.out.println("偶数：");
		for(i = 31;i >= 1;i-=2)
		{
			System.out.print((num >> i) & 1);
		}
		System.out.println();
		//奇数
		System.out.println("奇数：");
		for(i = 30;i >= 0;i-=2)
		{
			System.out.print((num >> i) &1);
		}
		System.out.println();
		sc.close();
	}
}
