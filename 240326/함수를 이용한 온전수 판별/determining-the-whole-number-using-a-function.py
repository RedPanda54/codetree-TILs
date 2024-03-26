def is_perfect_number(num):
    return num % 2 != 0 and (num % 10) != 5 and (num % 3 != 0 or num % 9 == 0)

a, b = map(int, input().split())
count = 0

for num in range(a, b+1):
    if is_perfect_number(num):
        count += 1

print(count)