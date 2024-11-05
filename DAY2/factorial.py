#print factorial of a the given number
def factorial(n):
    fact = 1
    for i in range(n, 1, -1):
        fact = fact * i
    return fact

n = int(input("Enter the number: "))
res = factorial(n)
print("The factorial of the number: ", res)