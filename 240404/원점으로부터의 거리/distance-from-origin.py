class Point:
    def __init__(self, x, y, number):
        self.x = x
        self.y = y
        self.number = number
        
n = int(input())
points = []
for i in range(1, n+1):
    x, y = map(int, input().split())
    points.append(Point(x, y, i))
    
points.sort(key=lambda Point: (abs(Point.x) + abs(Point.y)))

for point in points:
    print(point.number)