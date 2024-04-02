n = int(input())
list_num = list(map(int, input().split()))
result = []
for num in list_num:
    result.append(num)
    if num % 2 == 1:
        result.sort()
        print(result[len(result) // 2], end=' ')