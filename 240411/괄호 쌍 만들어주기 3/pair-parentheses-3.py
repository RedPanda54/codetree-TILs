bracket = input().strip()
count = 0

length = len(bracket)

for i in range(length):
    for j in range(i+1, length):
        if bracket[i] == '(' and bracket[j] == ')':
            count += 1

print(count)