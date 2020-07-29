/**
 * 
 */
package HomeWork;

import java.util.Random;
import java.util.Scanner;


/**
*  @Description     猜数字
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午6:59:00
*/
public class GuessTheNumber 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();//生成一个随机数
		int random = rnd.nextInt(100) + 1;//[0 —— 100]
		System.out.println(random);
		while(true)
		{
			System.out.println("请输入你要猜的数字：");
			int n = sc.nextInt();
			if(n < random)
			{
				System.out.println("猜小了，弟弟！");
			}
			else if(n == random)
			{
				System.out.println("猜对了，孩子！");
				break;
			}
			else
			{
				System.out.println("猜大了，弟弟！");
			}
			
		}
	}
}
