n, t = map(int, input().split())
r, c, d = input().split()
r, c, = int(r), int(c)

Wall = 10000001
grid = [[Wall for _ in range(n+2)] for _ in range(n+2)]

for i in range(1, n+1):
    for j in range(1, n+1):
        grid[i][j] = 0

def is_Wall(x):
    return x == 10000001

dir = [(-1, 0), (0, -1), (1, 0), (0, 1)] # 상좌하우
if d == 'U':
    dr, dc = dir[0]
    stare = 0
elif d == 'L':
    dr, dc = dir[1]
    stare = 1
elif d == 'D':
    dr, dc = dir[2]
    stare = 2
else:
    dr, dc = dir[3]
    stare = 3
    
for _ in range(1, t):
    if is_Wall(grid[r+dr][c+dc]):
        dr, dc = dir[(stare + 2) % 4]
    r += dr
    c += dc

print(r, c)