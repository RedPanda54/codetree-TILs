# 전처리
x, y = 0, 0
dir = [(0, 1), (1, 0), (0, -1), (-1, 0)]

stare = 0
str = input()
commands = list(str)
for command in commands:
    if command == 'L':
        if stare == 0:
            stare = 3
        else:
            stare -= 1
    elif command == 'R':
        if stare == 3:
            stare = 0
        else:
            stare += 1
    else:
        x += dir[stare][0]
        y += dir[stare][1]

print(x, y)