/**
 * 
 */
package Java7_16;

import java.util.Scanner;

/**
*  @Description     交换两个整数的值
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月24日上午12:21:08
*/
public class Swap 
{
	private static void swap1(int x,int y)
	{
		System.out.println("交换前 :x = " + x + ",y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("交换后 :x = " + x + ",y = " + y);
	}
	private static void swap2(int x,int y)
	{
		System.out.println("交换前 :x = " + x + ",y = " + y);
		x = y - x;
		y = y - x;
		x = x + y;
		System.out.println("交换后 :x = " + x + ",y = " + y);
	}
	private static void swap3(int x,int y)
	{
		System.out.println("交换前 :x = " + x + ",y = " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("交换后 :x = " + x + ",y = " + y);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个整数值：");
		int a = sc.nextInt();
		System.out.print("请输入第二个整数值：");
		int b = sc.nextInt();
		
		for(int i = 1;i < 4;i++)
		{
			switch(i)
			{
			case 1:
				swap1(a,b);
				break;
				
			case 2:
				swap2(a,b);
				break;
				
			case 3:
				swap3(a,b);
				break;
				
				default:
					System.out.println("退出！！！");
					break;
			}
		}
	}
}
