a, b = map(int, input().split())
n = int(input())
n = str(n)
n = int(n, a)

digits = []
while True:
    if n < b:
        digits.append(n)
        break
        
    digits.append(n % b)
    n //= b
    
digits = digits[::-1]
for num in digits:
    print(num, end='')