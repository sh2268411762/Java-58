/**
 * 
 */
package ProgramLogicControl;

import java.util.Scanner;

/**
*  @Description     if语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午6:03:03
*/
public class if_public 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) 
	{
		int a = 10;
		Scanner sc = new Scanner(System.in);
		if(a >= 0 && a < 10)
		{
			System.out.println("abc,a = " + a);
		}
		else if(a >=10 && a <20 ) 
		{
			System.out.println("123,a = " + a);
		}
		else
		{
			System.out.println("ABC,a = " + a);
		}
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year + "年是闰年");
		}
		else
		{
			System.out.println(year + "年不是闰年");
		}
	}
}
