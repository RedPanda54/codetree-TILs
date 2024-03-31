def calculate(n):
    if n == 1 or n == 2:
        return n
    return n + calculate(n-2)
    
n = int(input())
print(calculate(n))