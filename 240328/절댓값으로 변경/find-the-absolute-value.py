def abs_of_element(num):
    return abs(num)

n = int(input())
arr = list(map(int, input().split()))

for i in range(len(arr)):
    arr[i] = abs_of_element(arr[i])

for num in arr:
    print(num, end=' ')