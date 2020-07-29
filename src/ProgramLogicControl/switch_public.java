/**
 * 
 */
package ProgramLogicControl;

import java.util.Scanner;

/**
*  @Description     switch语句
*  @author          孙豪
*  @version         不能做switch语句的数据类型：long、float、double、boolean
*  					switch的参数最大只能是整型，4个字节（char可以）
*  					switch参数可以是字符串，枚举
*  @Date            2020年7月29日下午6:19:43
*/
public class switch_public 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的选择：");
		int select = sc.nextInt();
		switch(select)
		{
		case 1:
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		default:
			System.out.println("输入有误！！！");
			break;
		}
	}
}
