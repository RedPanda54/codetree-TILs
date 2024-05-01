n, t = map(int, input().split())
seq = list(map(int, input().split()))

count = 0
answer = 0
for i in range(n):
    if seq[i] <= t:
        answer = max(answer, count)
        count = 0
    else:
        count += 1

answer = max(answer, count)
print(answer)