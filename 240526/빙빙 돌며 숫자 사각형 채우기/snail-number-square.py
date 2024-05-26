def in_range(x, y):
    return (x >= 0 and x < n) and (y >= 0 and y < m)

n, m = map(int, input().split())
matrix = [[0] * m for _ in range(n)]
matrix[0][0] = 1

dir = [(0, 1), (1, 0), (0, -1), (-1, 0)]
x, y = 0, 0
dir_num = 0
dx, dy = dir[dir_num]

for i in range(2, n * m + 1):
    nx, ny = x + dx, y + dy
    
    if not in_range(nx, ny) or matrix[nx][ny] != 0:
        dir_num = (dir_num + 1) % 4
    
    dx, dy = dir[dir_num]
    x += dx
    y += dy
    matrix[x][y] = i

for x in range(n):
    for y in range(m):
        print(matrix[x][y], end = ' ')
    print()