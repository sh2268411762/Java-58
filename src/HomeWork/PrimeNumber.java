/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     素数判断
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午7:26:20
*/
public class PrimeNumber 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		
		if(num == 2)
		{
			System.out.println(num + "是素数");
		}
		else if(num <= 1)
		{
			System.out.println("小于等于1的数不参与判断");
		}
		else
		{
			int i = 2;
			for(;i < num;i++)
			{
				if(num % i == 0)
				{
					System.out.println(num + "不是素数");
					break;
				}
			}
			
			if(i == num)
			{
				System.out.println(num + "是素数");
			}
		}
		
		System.out.println("1到100之间的素数：");
		int number = 2;
		for(;number <= 100;number++)
		{
			if(number == 2)
			{
				System.out.print(number + " ");
				number++;
				continue;
			}
			int i = 2;
			for(;i < number;i++)
			{
				if(number % i == 0)
				{
					break;
				}
			}
			
			if(i == number)
			{
				System.out.print(number + " ");
			}
		}
	}
}
