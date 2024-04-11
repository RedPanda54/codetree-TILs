n = int(input())
cow = list(map(int, input().split()))
count = 0

length = len(cow)

for i in range(length-2):
    for j in range(i+1, length-1):
        for k in range(j+1, length):
            if cow[i] <= cow[j] and cow[j] <= cow[k]:
                count += 1
print(count)