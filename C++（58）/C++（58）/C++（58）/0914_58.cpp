//#include <iostream>
//using namespace std;
//
//
////�����ռ䣨��ֹ������Ⱦ������:�����ռ����Ƕ�ס����ã���ʹ�������ռ��еı���������
//namespace N1  //1�����
//{
//	//�������������
//	int a = 10 ;
//	int b = 20;
//	
//	int Add(int x, int y)
//	{
//		return x + y;
//	}
//}
//namespace N2   //2�������ռ����Ƕ��
//{
//	int a = 10;
//	int b = 90;
//
//	int sub(int x, int y)
//	{
//		return x - y;
//	}
//	namespace Nn2 //Ƕ��
//	{
//		int c = 10;
//		int d = 10;
//
//		int mul(int x, int y)
//		{
//			return x * y;
//		}
//	}
//}
//namespace N1  //3����ͬһ�����п��Զ�����������ͬ�������ռ�
//{             //�������Ὣ�����ͬ���Ƶ������ռ�ϲ���һ��
//	int div(int x, int y)
//	{
//		return x / y;
//	}
//}
//
//
//
//
//
////N::a    using N::a   using namespace N
//
//
//int main()
//{
//	int a = N1::a;
//	cout << a << endl;
//	return 0;
//}