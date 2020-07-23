/**
 * 
 */
package Java7_16;

import java.util.Scanner;

/**
*  @Description     求三个数中的最大值和最小值
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月24日上午12:34:49
*/
public class Max_Min 
{
	@SuppressWarnings({  "resource" })
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.print("请输入第二个整数：");
		int b = sc.nextInt();
		System.out.print("请输入第三个整数：");
		int c = sc.nextInt();
		
		int Max = a;
		int Min = a;
		int[]arr = {a,b,c};

		for(int i = 0;i < 3;i++)
		{
			if(Max < arr[i])
			{
				Max = arr[i];
			}
			if(Min > arr[i])
			{
				Min = arr[i];
			}
		}
		System.out.println("最大值Max = " + Max + "\n最小值Min = " + Min);
	}
}
