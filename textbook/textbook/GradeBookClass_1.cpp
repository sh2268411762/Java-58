//#include <iostream>
//#include <string>
//using namespace std;
//
//class GradeBook
//{
//public:
//	void setName(string name)
//	{
//		courseName = name;
//	}
//	string getName() const
//	{
//		return courseName;
//	}
//	void displayMessage() const  //const  ��ʾ�ú������޸ĵ������� GradeBook ����
//	{
//		cout << "Welcome to the grade book for:\n" << getName() << "!" << endl;
//		cout << "��ӭ����:����>" << getName() << "�γ�!" << endl;
//	}//��������
//
//private:
//	string courseName = "C++ class";   //���ݳ�Ա�ɱ���ĳ�Ա����
//};
//
//int main()
//{
//	GradeBook g1;
//	string str;
//
//	cout << "��ʼ�γ�����" << g1.getName() << endl;
//	cout << "������γ�����" << endl;
//	getline(cin, str);
//	g1.setName(str);//���γ�����ֵ
//	cout << endl;
//	g1.displayMessage();
//	return EXIT_SUCCESS;
//}