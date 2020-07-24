/**
 * 
 */
package Java7_16;

/**
*  @Description     运算符
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月24日下午11:47:37
*/
public class siZeYunSuan 
{
	public static void main(String[] args) {
		// << 左移  >> 右移   >>> 无符号右移
	}
	public static void main2(String[] args) 
	{
		System.out.println(10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % 3);
		System.out.println(-10 % -3);
		//求余所得结果只与前面数的符号有关
	}
	public static void main1(String[] args) 
	{
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println((float)5 / 2);
		System.out.println(5 / (float)2);
		System.out.println((float)(5 / 2));
	}
}
