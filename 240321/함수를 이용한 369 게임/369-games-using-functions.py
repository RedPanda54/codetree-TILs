def is_magic_number(number):
    return (number // 10) == 3 or (number // 10) == 6 or (number // 10) == 9 or (number % 10) == 3 or (number % 10) == 6 or (number % 10) == 9

def is_three_num(number):
    return number % 3 == 0 or is_magic_number(number)

a, b = map(int, input().strip().split())
count = 0

for i in range(a, b+1):
    if is_three_num(i):
        count += 1

print(count)