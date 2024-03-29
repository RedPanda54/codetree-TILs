def solution(A, m):
    global m

    total_sum = 0

    while m:
        total_sum += A[m]

        if m % 2 == 1:
            m -= 1
        else:
            m //= 2

    return total_sum

n, m = map(int, input().split())
A = [0] + list(map(int, input().split()))

print(solution(A, m))