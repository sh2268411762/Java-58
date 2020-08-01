/**
 * 
 */
package Method;

/**
*  @Description     交换数字
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月30日下午5:47:05
*/
public class Swap 
{
	public static void swap(Person person)
	{
		int temp = person.a;
		person.a = person.b;
		person.b = temp;
	}
	public static void main(String[] args) 
	{
		Person person = new Person();
		person.a = 10;
		person.b = 20;
		System.out.println("交换前：" + person.a + " " + person.b);
		swap(person);
		System.out.println("交换后：" + person.a + " " + person.b);
	}
}
