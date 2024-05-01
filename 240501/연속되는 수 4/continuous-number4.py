n = int(input())
numbers = [int(input()) for _ in range(n)]

count = 1
answer = 0
for i in range(1, n):
    if numbers[i] <= numbers[i-1]:
        answer = max(answer, count)
        count = 1
    else:
        count += 1

answer = max(answer, count)
print(answer)