def prime(a,b):
    p = []
    for n in range(a, b+1):
        is_prime = True
        if a == 1:
            is_prime = False

        for i in range(2, n):
            if n % i == 0:
                is_prime = False

        if is_prime:
            p.append(n)

    return sum(p)

a, b = map(int, input().split())
print(prime(a, b))