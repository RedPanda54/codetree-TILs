A = [0]
B = [0]

a_pos = 0
b_pos = 0

n, m = map(int, input().split())

for _ in range(n):
    time, dir = input().split()
    time = int(time)
    for _ in range(time):
        if dir == 'R':
            a_pos += 1
            A.append(a_pos)
        else:
            a_pos -= 1
            A.append(a_pos)
            
for _ in range(m):
    time, dir = input().split()
    time = int(time)
    for _ in range(time):
        if dir == 'R':
            b_pos += 1
            B.append(b_pos)
        else:
            b_pos -= 1
            B.append(b_pos)

if len(A) < len(B):
    for i in range(len(A), len(B)):
        A.append(A[-1])
elif len(B) > len(A):
    for i in range(len(B), len(A)):
        B.append(B[-1])

answer = 0
length = max(len(A), len(B))
for i in range(1, length):
    if A[i-1] != B[i-1] and A[i] == B[i]:
        answer += 1

print(answer)