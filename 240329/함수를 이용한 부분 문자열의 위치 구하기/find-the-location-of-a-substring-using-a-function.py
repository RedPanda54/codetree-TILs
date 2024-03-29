def find_index(n, m):
    if n.find(m) != -1:
        return n.find(m)
    return -1

n = input()
m = input()

print(find_index(n, m))