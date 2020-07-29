/**
 * 
 */
package HomeWork;

/**
*  @Description     乘法口诀表
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午7:49:03
*/
public class multiplicationTable 
{
	public static void main(String[] args) 
	{
		int i = 1;
		for(;i <= 9;i++)
		{
			int j = 1;
			for(;j <= i;j++)
			{
//				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.printf("%d * %d = %-4d",j,i,i * j);
			}
			System.out.println();
		}
	}
}
