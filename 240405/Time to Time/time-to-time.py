a, b, c, d = map(int, input().split())
a *= 60
c *= 60

time_line = (c+d) - (a+b)
print(time_line)