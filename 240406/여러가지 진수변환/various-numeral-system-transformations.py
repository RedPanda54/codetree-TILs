def to_four(n):
    digits = []
    while True:
        if n < 4:
            digits.append(n)
            break
        
        digits.append(n % 4)
        n //= 4
    
    digits = digits[::-1]
    for num in digits:
        print(num, end='')
    

def to_eight(n):
    print(oct(n)[2:])

n, b = map(int, input().split())
if b == 4:
    to_four(n)
else:
    to_eight(n)