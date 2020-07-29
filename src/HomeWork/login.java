/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     模拟登陆
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午8:34:47
*/
public class login 
{
	public static void main(String[] args) 
	{
		int str1 = 123456;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("请输入密码：");
		while(count < 3)
		{
			int str = sc.nextInt();
			if(str == str1)
			{
				count++;
				break;
			}
			else
			{
				if((2-count) > 0)
				{
					System.out.println("输入有误，你还有" + (2-count) + "次机会,请重新输入：");
				}
				else
				{
					System.out.println("你没有机会了！！！");
				}
				count++;
			}
		}
		if(count >= 3)
		{
			System.out.println("多想想密码");
		}
		else
		{
			System.out.println("恭喜，登陆成功！！！");
		}
		sc.close();
	}
}
