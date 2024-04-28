OFFSET = 100

n = int(input())
rects = [tuple(map(int, input().split())) for _ in range(n)]
area = [[0] * (201) for _ in range(201)]

for x1, y1, x2, y2 in rects:
    x1, y1 = x1 + OFFSET, y1 + OFFSET
    x2, y2 = x2 + OFFSET, y2 + OFFSET
    for i in range(x1, x2):
        for j in range(y1, y2):
            area[i][j] = 1

# total_area = sum(sum(row) for row in rectangle)
total_area = 0
for x in range(0, 201):
    for y in range(0, 201):
        if area[x][y]:
            total_area += 1
print(total_area)