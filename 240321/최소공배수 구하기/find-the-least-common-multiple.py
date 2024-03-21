def find_LCM(n, m):
    common = n
    while (True):
        if (common % n == 0) and (common % m == 0):
            break
        else:
            common += n
    return common

n, m = map(int, input().strip().split())
print(find_LCM(n, m))