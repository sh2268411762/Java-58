//#include <iostream>
//#include <string>
//using namespace std;
//
//class GradeBook
//{
//public:
//	explicit GradeBook(string name) //���캯��
//		:courseName(name)
//	{
//
//	}
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
//	GradeBook g1("CS101 Introduction toC++ Programming");
//	GradeBook g2("CS102 Data Structures in C++");
//
//	cout << "g1:" << g1.getName() << endl;
//	cout << "g2:" << g2.getName() << endl;
//	return EXIT_SUCCESS;
//}