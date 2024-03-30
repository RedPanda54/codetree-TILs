def calculate(n):
    count = 0
    if n == 1:
        return count
    else:
        if n % 2 == 0:
            n /= 2
        else:
            n //= 3
        count += 1
        return count + calculate(n)
        

n = int(input())
print(calculate(n))