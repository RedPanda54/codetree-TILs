n = int(input())
arr = [input().strip() for _ in range(n)]

arr.sort()
for i in range(n):
    print(arr[i])