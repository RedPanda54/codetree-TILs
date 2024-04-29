OFFSET = 1000

rects = [
    tuple(map(int, input().split()))
    for _ in range(2)
]

area = [[0] * 2001 for _ in range(2001)]

# 첫번째 직사각형(A) - (a, b), (c, d)
A_a, A_b, A_c, A_d = rects[0]
A_a, A_b, A_c, A_d = A_a+OFFSET, A_b+OFFSET, A_c+OFFSET, A_d+OFFSET
for x in range(A_a, A_c):
    for y in range(A_b, A_d):
        area[x][y] = 1

# 두번째 직사각형(B) - (a, b), (c, d)
B_a, B_b, B_c, B_d = rects[1]
B_a, B_b, B_c, B_d = B_a+OFFSET, B_b+OFFSET, B_c+OFFSET, B_d+OFFSET
for x in range(B_a, B_c):
    for y in range(B_b, B_d):
        area[x][y] = 0

min_x, min_y, max_x, max_y = 2001, 2001, 0, 0
for x in range(A_a, A_c):
    for y in range(A_b, A_d):
        if area[x][y] == 1:
            min_x = min(min_x, x)
            min_y = min(min_y, y)
            max_x = max(max_x, x)
            max_y = max(max_y, y)

print((max_x-min_x+1) * (max_y-min_y+1)) if min_x, min_y, max_x, max_y != 2001, 2001, 0, 0 else 0