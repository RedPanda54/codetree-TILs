n = int(input())
list_num = list(map(int, input().split()))
result = []
for i in range(n):
    result.append(list_num[i])
    if len(result) % 2 == 1:
        result.sort()
        
        print(result[(len(result) // 2)], end=' ')