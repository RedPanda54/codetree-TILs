def calculate(n):
    if n < 10:
        return n ** 2
    temp = n % 10
    return temp ** 2 + calculate(n // 10)

n = int(input())
print(calculate(n))