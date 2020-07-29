package HomeWork;

/**
*  @Description     输出1000到2000之间的闰年
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月29日下午7:36:36
*/
public class leapYear 
{
	public static void main(String[] args) 
	{
		int year = 1000;
		for(;year <= 2000;year++)
		{
			if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0)
			{
				System.out.print(year + "   ");
			}
		}
		System.out.println("打印完成!!!");
	}
}
