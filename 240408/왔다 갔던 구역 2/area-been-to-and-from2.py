n = int(input())
OFFSET = 1000
count = [0] * 2001
origin_point = 1000

for _ in range(n):
    dx, shift = map(str, input().split())
    dx = int(dx)
    
    if shift == 'L':
        for i in range(origin_point, origin_point - (dx+1), -1):
            count[i] += 1
        origin_point -= dx
    else:
        for i in range(origin_point, origin_point + (dx+1), 1):
            count[i] += 1
        origin_point += dx
    
print(count.count(2))