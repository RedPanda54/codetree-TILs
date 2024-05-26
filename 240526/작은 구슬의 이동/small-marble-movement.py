n, t = map(int, input().split())
r, c, d = input().split()
x = int(r)
y = int(c)

MAX = 10000001
matrix = [[MAX for _ in range(n+2)] for _ in range(n+2)]
for i in range(1, n+1):
    for j in range(1, n+1):
        matrix[i][j] = 0

dir = [(0, 1), (1, 0), (-1, 0), (0, -1)]
dir_dic = {
    'R': 0,
    'U': 1,
    'D': 2,
    'L': 3
}
dir_num = dir_dic[d]
dx, dy = dir[dir_num]
for _ in range(t):
    if matrix[x + dx][y + dy] != MAX:
        x += dx
        y += dy
    else:
        dir_num = 3 - dir_num
        dx, dy = dir[dir_num]
    
print(x, y)