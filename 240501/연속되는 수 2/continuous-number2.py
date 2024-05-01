n = int(input())
numbers = [int(input()) for _ in range(n)]

count = 1
for i in range(1, n):
    if numbers[i] != numbers[i-1]:
        count += 1
print(count)