def li_search(arr,x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1
arr_size = int(input("Enter the size of array: "))
arr = []
for i in range(arr_size):
    ele = int(input("Enter the element: "))
    arr.append(ele)
x = int(input("Enter the element to search:"))
res = li_search(arr,x)
if res >= 0:
    print("Element is found at position ", res + 1)
else:
    print("Element is not found")