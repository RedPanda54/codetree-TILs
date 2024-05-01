n = int(input())
numbers = [int(input()) for _ in range(n)]

count = 1
answer = 0
for i in range(1, n):
    if numbers[i] > 0:
        if numbers[i-1] < 0:
            answer = max(answer, count)
            count = 1
        else:
            count += 1
    else: # numbers[i] < 0
        if numbers[i-1] > 0:
            answer = max(answer, count)
            count = 1
        else: # numbers[i-1] < 0:
            count += 1

answer = max(answer, count)
print(answer)