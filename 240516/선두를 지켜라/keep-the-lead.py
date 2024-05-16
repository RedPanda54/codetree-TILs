A = [0]
B = [0]

n, m = map(int, input().split())

for _ in range(n):
    velo, time = map(int, input().split())
    for _ in range(time):
        position = A[-1]
        A.append(position + velo)

for _ in range(m):
    velo, time = map(int, input().split())
    for _ in range(time):
        position = B[-1]
        B.append(position + velo)

answer = 0
head = 1 if A[1] >= B[1] else 0
for i in range(len(A)):
    if head == 0 and A[i] > B[i]:
        head = 1
        answer += 1
    elif head == 1 and A[i] < B[i]:
        head = 0
        answer += 1

print(answer)