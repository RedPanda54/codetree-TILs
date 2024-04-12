def manhattan_distance(x1, y1, x2, y2):
    return abs(x1 - x2) + abs(y1 - y2)

n = int(input())
check_point = []
for _ in range(n):
    x, y = map(int, input().split())
    check_point.append((x, y))

distance = 100000000

index = 1
temp = 0
x1, y1 = check_point[0]
while index != n:
    for i, (x, y) in enumerate(check_point):
        if index == i:
            continue
        else:
            x2, y2 = x, y
            temp += manhattan_distance(x1, y1, x2, y2)
            x1, y1 = x2, y2
    distance = min(distance, temp)
    
    temp = 0
    index += 1

print(distance)