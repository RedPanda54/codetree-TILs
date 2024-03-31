def calculate(n):
    if n == 1 or n == 2:
        return n
    elif n % 2 == 1:
        return n + calculate(n-2)
    else:
        return n + calculate(n-2)
    
n = int(input())
print(calculate(n))