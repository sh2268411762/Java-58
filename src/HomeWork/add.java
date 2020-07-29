/**
 * 
 */
package HomeWork;

/**
*  @Description     求1/1 - 1/2 +1/3 - 1/4 ...... + 1/99 - 1/100
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午8:10:35
*/
public class add 
{
	public static void main(String[] args) 
	{
		double sum1 = 0;
		double sum2 = 0;
		for(double i = 1;i <= 99;i += 2)
		{
			sum1 += (1 / i);
		}
		System.out.println(sum1);
		
		for(double i = 2;i <= 100;i += 2)
		{
			sum2 += (1 / i);
		}
		System.out.println(sum2);
		
		System.out.println(sum1 - sum2);
	}
}
