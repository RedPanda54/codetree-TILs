n, m, k = map(int, input().split())
student = [0 for _ in range(n+1)]

for _ in range(m):
    panalty = int(input())
    student[panalty] += 1

answer = -1
for i in range(1, len(student)):
    if student[i] >= k:
        answer = i
        break

print(answer)