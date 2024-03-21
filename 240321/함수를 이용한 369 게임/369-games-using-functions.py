def is_magic_num(number):
    one_num = number % 10
    if one_num == 3 or one_num == 6 or one_num == 9:
        return True

    for _ in range(6):
        number = number // 10
        one_num = number % 10
        if one_num == 3 or one_num == 6 or one_num == 9:
            return True

def is_three_num(number):
    return number % 3 == 0 or is_magic_num(number)

a, b = map(int, input().strip().split())
count = 0

for i in range(a, b+1):
    if is_three_num(i):
        count += 1

print(count)