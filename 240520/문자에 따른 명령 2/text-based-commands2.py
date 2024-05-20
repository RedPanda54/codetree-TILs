# 전처리
x, y = 0, 0
dir = [(0, 1), (1, 0), (0, -1), (-1, 0)]

stare = 0
str = input()
commands = list(str)
for command in commands:
    if command == 'L':
        stare = (stare - 1 + 4) % 4
    elif command == 'R':
        stare = (stare + 1) % 4
    else:
        x += dir[stare][0]
        y += dir[stare][1]

print(x, y)