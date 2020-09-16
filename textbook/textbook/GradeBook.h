#ifndef _GradeBook_H_
#define _GradeBook_H_

#include <iostream>
#include <string>

using namespace std;

class GradeBook
{
public:
	explicit GradeBook(string name) //���캯��
		:courseName(name)
	{

	}
	void setName(string name)
	{
		courseName = name;
	}
	string getName() const
	{
		return courseName;
	}
	void displayMessage() const  //const  ��ʾ�ú������޸ĵ������� GradeBook ����
	{
		cout << "Welcome to the grade book for:\n" << getName() << "!" << endl;
		cout << "��ӭ����:����>" << getName() << "�γ�!" << endl;
	}//��������

private:
	string courseName = "C++ class";   //���ݳ�Ա�ɱ���ĳ�Ա����
};






#endif // !_GradeBook_H���б�������