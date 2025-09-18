#include <iostream>
#include <list>
#include <stack>
using namespace std;

int main() {
    // Запись массива данных типа список на C++
    list<int> myList = {1, 2, 3};
    for (int val : myList) {
        cout << val << " "; // => 1 2 3
    }
    cout << endl;

    // Создание структуры данных типа стек на C++ с использованием stack
    stack<string> myStack;
    myStack.push("anna");
    myStack.push("elena");
    myStack.push("katya");

    // Извлечение элементов из стека (LIFO)
    cout << myStack.top() << endl; // => katya
    myStack.pop();
    cout << myStack.top() << endl; // => elena
    myStack.pop();
    cout << myStack.top() << endl; // => anna

    return 0;
}