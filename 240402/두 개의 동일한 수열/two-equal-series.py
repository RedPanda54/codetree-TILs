n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

A.sort()
B.sort()

for i in range(n):
    if A[i] != B[i]:
        print("No")
        break
    if i == n-1 and A[i] == B[i]:
        print("Yes")