#include <iostream>
#include "GradeBook.h"
using namespace std;


int main()
{
	GradeBook g1("CS101 Introduction toC++ Programming");
	GradeBook g2("CS102 Data Structures in C++");

	cout << "g1:" << g1.getName() << endl;
	cout << "g2:" << g2.getName() << endl;
	return EXIT_SUCCESS;
}