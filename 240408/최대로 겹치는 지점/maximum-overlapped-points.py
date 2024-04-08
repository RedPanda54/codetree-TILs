n = int(input())
line = [tuple(map(int, input().split())) for _ in range(n)]

count = [0] * 101

for start, end in line:
    for i in range(start, end):
        count[i] += 1

print(max(count) + 1)