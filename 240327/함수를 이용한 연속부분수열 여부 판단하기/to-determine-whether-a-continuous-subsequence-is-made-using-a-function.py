def is_subsequence(a, b):
    if a.find(b) != -1:
        return True
    return False

def to_str(arr):
    sequence = ''
    for i in range(len(arr)):
        sequence += str(arr[i])
    return sequence

n1, n2 = map(int, input().split())  # A와 B의 원소의 개수

A = list(map(int, input().split()))
a = ''
B = list(map(int, input().split()))
b = ''

a = to_str(A)
b = to_str(B)

if is_subsequence(a, b):
    print("Yes")
else:
    print("No")