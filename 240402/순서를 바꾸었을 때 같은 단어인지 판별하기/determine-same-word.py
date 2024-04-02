arr_a = list(input())
arr_b = list(input())

arr_a.sort()
arr_b.sort()

a = ''.join(arr_a)
b = ''.join(arr_b)

if a == b:
    print("Yes")
else:
    print("No")