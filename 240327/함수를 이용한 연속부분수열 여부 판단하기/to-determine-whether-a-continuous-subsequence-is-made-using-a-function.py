def is_part_str(a, b):
    if a.find(b) != -1:
        return True
    return False

n1, n2 = map(int, input().split())  # A와 B의 원소의 개수

A = list(map(int, input().split()))
a = ''
B = list(map(int, input().split()))
b = ''

for i in range(len(A)):
    a += str(A[i])
for i in range(len(B)):
    b += str(B[i])

if is_part_str(a, b):
    print("Yes")
else:
    print("No")