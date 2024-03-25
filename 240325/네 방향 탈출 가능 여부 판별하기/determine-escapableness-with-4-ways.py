from collections import deque

n, m = map(int, input().split())

MAX = 10000
grid = [[-MAX] * (m+2) for _ in range(n+2)]

for i in range(1, n+1):
    temp = list(map(int, input().split()))
    for j in range(1, m+1):
        if temp[j-1] == '1':
            grid[i][j] = MAX

visited = [[False] * (m+2) for _ in range(n+2)]
for i in range(1, n+1):
    for j in range(1, m+1):
        if grid[i][j] == MAX:
            visited[i][j] = True

visited[1][1] = True

q = deque()
q.append((0, 0))

# 4가지 이동 방향
directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

while len(q) > 0 and visited[n][m] == False:
    now_row, now_col = q.popleft()

    for dr, dc in directions:
        r, c = now_row, now_col
        r += dr
        c += dc
        if visited[r][c] == False:
            visited[r][c] = True
            q.append((r, c)) 

print(1 if visited[n][m] else 0)