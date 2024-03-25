def is_leap_year(y):
    if y % 4 != 0:
        return False
    if y % 100 == 0 and y % 400 != 0:
        return False

    return True

y = int(input().strip())
if is_leap_year:
    print("true")
else:
    print("false")