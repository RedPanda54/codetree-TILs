def calculate(n):
    if n < 10:
        return n ** 2
    return (n % 10) ** 2 + calculate(n // 10)

n = int(input())
print(calculate(n))