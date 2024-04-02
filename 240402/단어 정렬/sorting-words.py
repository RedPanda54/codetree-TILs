n = int(input())
arr = []
for _ in range(n):
    arr.append(input().strip())

arr.sort()
for i in range(n):
    print(arr[i])