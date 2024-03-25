def is_leap_year(y):
    if y % 4 != 0:
        return False
    if (y % 100) == 0 and (y % 400) != 0:
        return False

    return True

y = int(input())
print("true" if is_leap_year(y) else "false")