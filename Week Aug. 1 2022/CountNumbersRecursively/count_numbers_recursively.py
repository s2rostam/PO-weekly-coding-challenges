# Create a function that will recursively count the number of digits of a number. Conversion of the
# number to a string is not allowed, thus, the approach is recursive.

# Assuming based on test cases no negative numbers allowed.

import math


def start(value):
    if ((type(value) is int or type(value) is float)):
        if (value < 0):
            value *= -1
        total = count_recursive(value, 0)
        print(total)
    else:
        print("Invalid input, must be a int or float!")

def count_recursive(num, count):
    if (num == 0 and count == 0):
        return 1
    elif (num//10 == 0 and num < 1):
        return count 
    else:
        count += 1
        return count_recursive(num//10, count)
    
if __name__ == '__main__':
    start(-1000)