n = int(input())
count = [0] * 2001
origin_point = 1000

now_position = origin_point

for _ in range(n):
    dx, shift = map(str, input().split())
    dx = int(dx)
    
    if shift == 'L':
        for i in range(now_position, now_position - (dx+1), -1):
            count[i] += 1
        now_position -= dx
    else:
        for i in range(now_position, now_position + (dx+1), 1):
            count[i] += 1
        now_position += dx
    
result = 0
for cnt in count:
    if cnt > 1:
        result += 1
print(result)