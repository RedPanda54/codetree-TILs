n, k = map(int, input().split())
blocks = [0] * (n+1)

for i in range(1, k+1):
    a, b = map(int, input().split())
    for j in range(a, b+1):
        blocks[j] += 1

print(max(blocks))