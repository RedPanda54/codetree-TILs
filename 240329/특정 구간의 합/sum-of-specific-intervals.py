def calculate_in_sub_list(arr):
    return sum(arr)

n, m = map(int, input().split())
A = list(map(int, input().split()))

for i in range(m):
    start, end = map(int, input().split())
    print(calculate_in_sub_list(A[start-1:end]))