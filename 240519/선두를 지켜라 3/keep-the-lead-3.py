n, m = map(int, input().split())
A = [0]
B = [0]

for _ in range(n):
    velo, time = map(int, input().split())
    for _ in range(time):
        pos = A[-1]
        A.append(pos + velo)
    
for _ in range(m):
    velo, time = map(int, input().split())
    for _ in range(time):
        pos = B[-1]
        B.append(pos + velo)

answer = 0
head = [0 for _ in range(len(A))]
    
for i in range(1, len(A)):
    if A[i] > B[i]:
        head[i] = 1
    elif A[i] < B[i]:
        head[i] = 2
    else:
        head[i] = 3
    
    if head[i] != head[i-1]:
        answer += 1

print(answer)