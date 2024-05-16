n, m, k = map(int, input().split())
student = [0 for _ in range(n+1)]

answer = -1
for _ in range(m):
    penalty_num = int(input())
    student[penalty_num] += 1
    if student[penalty_num] == k:
        answer = penalty
        break

print(answer)