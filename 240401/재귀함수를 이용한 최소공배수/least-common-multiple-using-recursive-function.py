def gcd(a, b):
    # 최대공약수를 구하는 함수
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    # 최소공배수를 구하는 함수
    return a * b // gcd(a, b)

def recursive_lcm(arr, n):
    if n == 1:
        # 기저 조건: 남은 숫자가 하나일 때, 그 수 자체가 최소공배수
        return arr[0]
    else:
        # 가장 큰 수와 나머지 수들의 최소공배수를 구함
        return lcm(arr[n - 1], recursive_lcm(arr, n - 1))

n = int(input())
arr = list(map(int, input().split()))
print(recursive_lcm(arr, n))