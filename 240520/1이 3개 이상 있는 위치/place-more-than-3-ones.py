n = int(input())
matrix = [[0 for _ in range(n+2)] for _ in range(n+2)]

row = 1
for _ in range(n):
    line = list(map(int, input().split()))
    for i in range(len(line)):
        matrix[row][i+1] = line[i]
    row += 1

dir = [(0, 1), (1, 0), (0, -1), (-1, 0)]

answer = 0
count = 0
for x in range(1, n+1):
    for y in range(1, n+1):
        for dx, dy in dir:
            if matrix[x+dx][y+dy] == 1:
                count += 1
        if count >= 3:
            answer += 1
        count = 0

print(answer)