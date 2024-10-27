# PRINT PRIME NUMBERS FROM 1 TO N
print("PRINT PRIME NUMBERS FROM 1 TO N:")
n = int(input("Enter the value of n:"))
for j in range(2,n+1):
    flag = 0
    for i in range(2,int(j**0.5)+1):
        if j % i == 0:
            flag = 1
            break
    if flag == 0:
        print(j)