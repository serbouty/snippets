#include <iostream>
#include "Calculator.cpp"

/* Standard C++ library for input and output resources. */
using namespace std;

/*
 * Run a calculator on the command-line interface,
 * then ask an arithmetic operation from the user.
 *
 * Format: a+b | a-b | a*b | a/b
 */
int main()
{
    double x = 0.0;
    char operation = '+';
    double y = 0.0;
    double result = 0.0;

    /* Send standard output to the stream. */
    cout << "Calculator Console Application\n\n";
    cout << "Please enter the operation to perform. [a+b] [a-b] [a*b] [a/b]\n";

    Calculator c;

    while (true)
    {
        /* Fetch standard input from the stream. */
        cin >> x >> operation >> y;

        /* Display an error when dividing by zero. */
        if (operation == '/' && y == 0)
        {
            cout << "Math error: Attempted to divide by zero!" << endl;
            continue;
        }

        result = c.Calculate(x, operation, y);
        cout << x << operation << y << " = " << result << endl;
    }
}