def print_star(n, start):
    if start > n: return

    print("*" * start)
    print_star(n, start+1)

n = int(input())
print_star(n, 1)