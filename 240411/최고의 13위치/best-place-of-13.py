n = int(input())
matrix = []
for _ in range(n):
    row = list(map(int, input().split()))
    matrix.append(row)
    
max_count = 0
for i in range(n):
    for j in range(n-2):
        max_count = max(max_count, matrix[i][j] + matrix[i][j+1] + matrix[i][j+2])

print(max_count)