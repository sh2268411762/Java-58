/**
 * 
 */
package Java7_16;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月16日上午9:23:46
*/
public class Java7_17_1 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if(flag == false)
		{
			System.out.println("int 最大值 = " + Integer.MAX_VALUE);
			System.out.println("int 最小值 = " + Integer.MIN_VALUE);
			int maxValue = Integer.MAX_VALUE;
			System.out.println(maxValue + 1);
			int minValue = Integer.MIN_VALUE;
			System.out.println(minValue - 1);
		}
		
		if(flag == true)
		{
			String str = "1234890";
			int a = Integer.parseInt(str);
			System.out.println(a);
		}
		
	}
}
