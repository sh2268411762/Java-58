/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     年龄划分
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午7:19:00
*/
public class Age 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) //main函数的参数叫做运行时参数
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int year = sc.nextInt();
		
		if(year <=0)
		{
			System.out.println("没有人");
		}
		else if(year > 0 && year <= 18)
		{
			System.out.println("少年," + year + "岁");
		}
		else if (year > 18 && year <= 28)
		{
			System.out.println("青年," + year + "岁");
		}
		else if(year > 28 && year <= 55)
		{
			System.out.println("中年," + year + "岁");
		}
		else
		{
			System.out.println("老年," + year + "岁");
		}
	}
}
