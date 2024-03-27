def is_month(M):
    return M >= 1 and M < 13
def is_day(M, D):
    if M == 1 or M == 3 or M == 5 or M == 7 or M == 8 or M == 10 or M == 12:
        return D >= 1 and D < 32
    elif M == 4 or M == 6 or M == 9 or M == 11:
        return D >= 1 and D < 31
    else:
        return D >= 1 and D < 29

M, D = map(int, input().split())

if is_month(M) and is_day(M, D):
    print("Yes")
else:
    print("No")