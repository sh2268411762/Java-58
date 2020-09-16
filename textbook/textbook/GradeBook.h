#ifndef _GradeBook_H_
#define _GradeBook_H_

#include <iostream>
#include <string>

using namespace std;

class GradeBook
{
public:
	explicit GradeBook(string name) //构造函数
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
	void displayMessage() const  //const  表示该函数不修改调用它的 GradeBook 对象
	{
		cout << "Welcome to the grade book for:\n" << getName() << "!" << endl;
		cout << "欢迎来到:——>" << getName() << "课程!" << endl;
	}//结束函数

private:
	string courseName = "C++ class";   //数据成员可被类的成员访问
};






#endif // !_GradeBook_H所有变量声明