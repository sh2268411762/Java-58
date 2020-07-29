/**
 * 
 */
package HomeWork;

/**
*  @Description     寻找1到100之间共有多少个9
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午8:19:28
*/
public class findNine 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 0;i <= 100;i++)
		{
			if(i % 10 == 9)
			{
				count++;
			}
			if(i / 10 == 9 && i % 10 != 9)
			{
				count++;
			}
		}
		System.out.println("1到100之间共出现->" + count + "个9");
	}
}
