def is_leap_year(Y):
    if Y % 4 != 0:
        return False
    else:
        if Y % 100 == 0:
            if Y % 400 == 0:
                return True
            return False
        else:
            return True

def what_is_season(M):
    if M >= 3 and M < 6:
        return 'Spring'
    elif M >= 6 and M < 9:
        return 'Summer'
    elif M >= 9 and M < 12:
        return 'Fall'
    else:
        return 'Winter'

def check_date(Y, M, D):
    if (M < 1) or (M > 12) or (D < 1) or (D > 31):
        return False
    else:
        if M == 2:
            if is_leap_year(Y):
                return D >= 1 and D <= 29
            else:
                return D >= 1 and D < 29
        elif M == 4 or M == 6 or M == 9 or M == 11:
            return D >= 1 and D < 31
        else:
            return D >= 1 and D <= 31

Y, M, D = map(int, input().split())

if check_date(Y, M, D):
    print(what_is_season(M))
else:
    print(-1)