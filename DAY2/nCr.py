#Calculate nCr binomial coefficient for n and r
def factorial(n):
    fact = 1
    for i in range(n, 1, -1):
        fact = fact * i
    return fact

n = int(input("Enter the number(n): "))
factn = factorial(n)
r = int(input("Enter the number(r): "))
factr = factorial(r)
factnr = factorial(n - r)
res = factn // ( factr * factnr )
print("The factorial of the number: ", res)