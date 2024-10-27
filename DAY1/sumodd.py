# SUM OF ALL ODD NUMBER FROM 1 TO N
print("SUM OF ALL ODD NUMBER FROM 1 TO N")
n = int(input("Enter the value of n:"))
sum = 0
for i in range (1,n):
    if i % 2 != 0:
        print(i)
        sum = sum + i
    
print("The sum of all numbers:",sum)