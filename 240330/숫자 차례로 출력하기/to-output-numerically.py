def print_number(n, i):
    if i > n: 
        print()
        return

    print(i, end=' ')
    print_number(n, i+1)
    print(i, end=' ')

n = int(input())
print_number(n, 1)