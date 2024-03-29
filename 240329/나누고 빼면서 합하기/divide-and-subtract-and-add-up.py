def solution(A, m):
    total_sum = 0
    while m >= 1:
        total_sum += A[m-1]
        if m % 2 == 1:
            m -= 1
        else:
            m //= 2
    return total_sum

n, m = map(int, input().split())
A = list(map(int, input().split()))

print(solution(A, m))