a = input().strip()
max_number = 0

for i in range(len(a)):
    temp = a
    temp = list(temp)
    if temp[i] == '1':
        temp[i] = '0'
        temp = ''.join(temp)
        temp = int(temp, 2)
        max_number = max(max_number, temp)
    else:
        temp[i] = '1'
        temp = ''.join(temp)
        temp = int(temp, 2)
        max_number = max(max_number, temp)

print(max_number)