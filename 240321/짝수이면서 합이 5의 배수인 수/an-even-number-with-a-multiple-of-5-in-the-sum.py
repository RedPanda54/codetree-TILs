def is_right(number):
    new_one = (number // 10) + (number % 10)
    return number % 2 == 0 and new_one % 5 == 0

n = int(input())
if is_right(n):
    print("Yes")
else:
    print("No")