n, m, k = map(int, input().split())
student = [0 for _ in range(n+1)]

answer = -1
for _ in range(m):
    penalty = int(input())
    student[penalty] += 1
    if student[penalty] == k:
        answer = penalty
        break

print(answer)