n = int(input())
count = [0] * 2001
origin_point = 1000

now_position = origin_point

for _ in range(n):
    dx, shift = map(str, input().split())
    dx = int(dx)
    
    if shift == 'L':
        for i in range(dx):
            count[i] += 1
            now_position -= 1
    else:
        for i in range(dx):
            count[i] += 1
            now_position += 1
    
result = 0
for i in range(len(count)):
    if count[i] > 1:
        result += 1
print(result)