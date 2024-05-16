# Setting
A = [0]
B = [0]

n, m = map(int, input().split())

# For A
for _ in range(n):
    dir, time = input().split()
    time = int(time)
    for _ in range(time):
        position = A[-1]
        if dir == 'R':
            A.append(position + 1)
        else:
            A.append(position - 1)

# For B
for _ in range(m):
    dir, time = input().split()
    time = int(time)
    for _ in range(time):
        position = B[-1]
        if dir == 'R':
            B.append(position + 1)
        else:
            B.append(position - 1)

length = len(A) if len(A) >= len(B) else len(B)

for i in range(1, length):
    if A[i] == B[i]:
        print(i)
        break
    if i == length-1 and A[i] != B[i]:
        print(-1)