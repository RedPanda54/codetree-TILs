OFFSET = 100

n = int(input())

squares = [
    tuple(map(int, input().split()))
    for _ in range(n)
]

area = [[0] * 201 for _ in range(201)]

for x, y in squares:
    for i in range(x, x+8):
        for j in range(y, y+8):
            area[i][j] = 1

total_area = 0
for x in range(201):
    for y in range(201):
        if area[x][y]:
            total_area += 1

print(total_area)