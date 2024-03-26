def is_prime_number(num):
    for i in range(2, num // 2 + 1):
        if num % i == 0:
            return False
    return True

def is_correct_number(num):
    one_num = num % 10
    ten_num = num // 10
    return (ten_num + one_num) % 2 == 0

a, b = map(int, input().split())
count = 0
for num in range(a, b+1):
    if num == 100:
        break
    if is_prime_number(num) and is_correct_number(num):
        count += 1
print(count)