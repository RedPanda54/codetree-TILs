n = int(input())

x, y = 0, 0
dir = [(1, 0), (-1, 0), (0, -1), (0, 1)] # 동서남북

for _ in range(n):
    str, distance = input().split()
    distance = int(distance)
    
    dx, dy = 0, 0
    if str == 'E':
        dx, dy = dir[0]
    elif str == 'W':
        dx, dy = dir[1]
    elif str == 'S':
        dx, dy = dir[2]
    else: # str == 'N'
        dx, dy = dir[3]

    x += dx * distance
    y += dy * distance

print(x, y)