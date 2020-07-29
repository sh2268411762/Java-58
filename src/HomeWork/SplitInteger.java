/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     分割整数
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午8:52:06
*/
public class SplitInteger 
{
	private static void getIndex(int x)
	{
		if(x < 0)
		{
			x = -x;
		}
		if(x > 9)
		{
			getIndex(x / 10);
		}
		System.out.print(x % 10 + " ");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要分割的整数：");
		int num = sc.nextInt();
		
		getIndex(num);
		sc.close();
	}
}
