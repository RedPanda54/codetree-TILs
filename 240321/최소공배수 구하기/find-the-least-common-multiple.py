def find_LCM(n, m):
    smaller = min(n, m)
    common = smaller
    while (True):
        if (common % n == 0) and (common % m == 0):
            break
        else:
            common += smaller
    print(common)

n, m = map(int, input().strip().split())
find_LCM(n, m)