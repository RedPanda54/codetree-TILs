def is_leap_year(y):
    answer = True
    if y % 4 == 0:
        answer = True
    elif y % 100 == 0 and y % 400 != 0:
        answer = False
    else:
        answer = False
    return answer

y = int(input().strip())
if is_leap_year:
    print("true")
else:
    print("false")