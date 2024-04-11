import sys

def solution(house):
    min_shift = sys.maxsize
    for i in range(len(house)):
        new_shift = 0
        
        for j in range(len(house)):
            if j == i:
                new_shift += 0
            else:
                new_shift += house[j] * abs(j-i)
        min_shift = min(min_shift, new_shift)
    return min_shift

n = int(input())
house = list(map(int, input().split()))

result = solution(house)

print(result)