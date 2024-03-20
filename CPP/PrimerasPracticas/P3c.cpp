#include <iostream>

using namespace std;

class Myclass {
	public: 
	void metodoUno(){
		cout << "Hello World!";
	}
	//se esta declarando publico el metodo
};

	int main (){
		Myclass objeto1;
		objeto1.metodoUno();
		return 0;
	}
