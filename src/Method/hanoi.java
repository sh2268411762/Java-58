/**
 * 
 */
package Method;

/**
*  @Description     汉诺塔
*  @author          孙豪
*  @version         1.0
*  @Date            2020年8月10日下午4:40:39
*/
public class hanoi 
{
	public static void fun(char pos1,char pos2)
	{
		System.out.print(pos1 + "->" + pos2 + " ");
	}
	public static void han(int n,char pos1,char pos2,char pos3)//盘子数目
	{
		if(n == 1)
		{
			fun(pos1,pos3);
		}
		else
		{
			han(n - 1,pos1,pos3,pos2);
			fun(pos1,pos3);
			han(n - 1,pos2,pos1,pos3);
		}
	}
	public static void main(String[] args) 
	{
		han(1,'A','B','C');
		System.out.println();
		han(2,'A','B','C');
		System.out.println();
		han(3,'A','B','C');
	}
}
