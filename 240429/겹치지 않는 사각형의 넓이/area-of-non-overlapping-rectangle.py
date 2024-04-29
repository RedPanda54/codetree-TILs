OFFSET = 1000

rects = [
    tuple(map(int, input().split()))
    for _ in range(2) # A, B
]

area = [[0] * 2001 for _ in range(2001)]

for x1, y1, x2, y2 in rects:
    for i in range(x1, x2):
        for j in range(y1, y2):
            area[i][j] = 1

a, b, c, d = map(int, input().split())
for i in range(a, c):
    for j in range(b, d):
        area[i][j] = 0

total_area = 0
for x in range(2001):
    for y in range(2001):
        if area[x][y]:
            total_area += 1

print(total_area)