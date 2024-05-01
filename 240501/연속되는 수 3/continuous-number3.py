n = int(input())
numbers = [int(input()) for _ in range(n)]

count = 1 if numbers[0] < 0 else 0
answer = 0
for i in range(1, n):
    if numbers[i] > 0:
        answer = max(answer, count)
        count = 0
    else: # numbers[i] < 0
        if numbers[i-1] > 0:
            count = 1
        else: # numbers[i-1] < 0:
            count += 1

print(answer)