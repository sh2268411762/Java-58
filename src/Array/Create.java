/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     定义数组，遍历数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月12日上午12:20:31
*/
public class Create 
{
	public static int[] fun(int[] arr,int length)
	{
		int[] a = new int[length];
		for (int i = 0; i < arr.length; i++) 
		{
			a[i] = 2 * arr[i];
		}
		return a;
	}
	public static void func(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] *= 2;
		}
	}
	public static void main(String[] args) 
	{
		int[] array = new int[] {1,2,3,4,5};
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		func(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		array = fun(array,array.length);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	public static void main1(String[] args) 
	{
		int[] array = {1,2,3,4,5};
		int[] array1 = new int[4];//定义一个数组，但是没有初始化,默认0
		int[] array2 = new int[] {1,2,3};//中括号不可以写具体的数值
		//遍历
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		for (int i : array2) {
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(array2));
	}
}
