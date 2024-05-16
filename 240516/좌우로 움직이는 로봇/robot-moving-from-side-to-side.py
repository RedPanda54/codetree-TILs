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

answer = 0
length = len(A) if len(A) <= len(B) else len(B)
dum = len(B) - length if len(A) <= len(B) else len(A) - length
for i in range(1, length):
    if A[i-1] != B[i-1] and A[i] == B[i]:
        answer += 1

if len(A) <= len(B):
    for j in range(length, length + dum):
        if A[-1] == B[j]:
            answer += 1
else:
    for j in range(length, length + dum):
        if B[-1] == A[j]:
            answer += 1

print(answer)