/**
 * 
 */
package Method;

/**
*  @Description     两个数相加
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月30日下午5:28:34
*/
public class add 
{
	public static int Add(int a,int b)
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int ret = Add(x,y);
		System.out.println(x + "+" + y + "=" +ret);
	}
}
