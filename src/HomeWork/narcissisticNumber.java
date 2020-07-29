/**
 * 
 */
package HomeWork;

/**
*  @Description     水仙花数
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午8:25:27
*/
public class narcissisticNumber 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.print("0到999之间的水仙花数有：");
		for(i = 100;i <= 999;i++)
		{
			int sum = (i%10)*(i%10)*(i%10) + (i/10%10)*(i/10%10)*(i/10%10) + (i/100)*(i/100)*(i/100);
			if(sum == i)
			{
				System.out.print(i + "  ");
			}
		}
		int n = 153;
		System.out.println("\n" + n%10);//3
		System.out.println(n/10%10);//5
		System.out.println(n/100);//1
	}
}
