def prime(a,b):
    p = []
    is_prime = True
    for n in range(a, b+1):
        if a == 1: continue
        for i in range(2, n):
            if n % i == 0:
                is_prime = False

        if is_prime:
            p.append(n)

    return sum(p)

a, b = map(int, input().split())
print(prime(a, b))