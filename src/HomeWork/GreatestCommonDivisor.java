/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     最大公约数
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午7:55:20
*/
public class GreatestCommonDivisor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个正整数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个正整数：");
		int num2 = sc.nextInt();
		
		if(num1 <= 0 || num2 <= 0)
		{
			System.out.println("输入有误，程序退出！！！");
		}
		else
		{
			if(num1 > num2)//交换
			{
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			int max = 0;
			for(int i = 1;i <= num1;i++)
			{
				if(num1 % i == 0)//可以整除
				{
					if(num2 % i == 0)
					{
						max = i;
					}
				}
			}
			System.out.println(num1 + "和" + num2 +"的最大公约数是" + max);
		}
		sc.close();
	}
}
