/**
 * 
 */
package ProgramLogicControl;

/**
*  @Description     while语句
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午6:27:28
*/
public class while_public 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int odd = 0;
		int eve = 0;
		while(i <= 100)
		{
			if(i % 2 == 0)
			{
				eve += i;
			}
			if(i % 2 != 0)
			{
				odd += i;
			}
			i++;
		}
		System.out.println("奇数和 ：" + odd + ",偶数和：" + eve + ",和：" + (odd + eve));
	}
	public static void main1(String[] args) 
	{
		int i = 0;
		while(i <= 10)
		{
			System.out.print(i + "->");
			i++;
		}
		System.out.println(i + "->" + "打印完成");
	}
}
