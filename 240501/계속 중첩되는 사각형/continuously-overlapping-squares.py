OFFSET = 100

n = int(input())
rects = []
for i in range(1, n+1):
    x1, y1, x2, y2 = map(int, input().split())
    x1 = x1 + OFFSET
    y1 = y1 + OFFSET
    x2 = x2 + OFFSET
    y2 = y2 + OFFSET
    
    if i % 2 == 1:
        rects.append(("R", x1, y1, x2, y2))
    else:
        rects.append(("B", x1, y1, x2, y2))

area = [[0] * 201 for _ in range(201)]

for color, x1, y1, x2, y2 in rects:
    for x in range(x1, x2):
        for y in range(y1, y2):
            if color == "R":
                area[x][y] = 0
            else: # color == "B"
                area[x][y] = 1

total_area = 0
for x in range(201):
    for y in range(201):
        if area[x][y] == 1:
            total_area += 1

print(total_area)