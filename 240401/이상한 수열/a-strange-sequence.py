def solution(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    else:
        return solution(n//3) + solution(n-1)

n = int(input())
print(solution(n))