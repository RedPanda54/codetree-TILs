from collections import defaultdict

N, K, P, T = map(int, input().split())

people = [0] * (N + 1)
handshake = defaultdict(int)
people[P] = 1
infos = [(input().split()) for _ in range(T)]
infos.sort(key = lambda x: int(x[0]))

for t, x, y in infos:
    t, x, y = int(t), int(x), int(y)
    if people[x] == 1 and people[y] == 1:
        handshake[x] += 1
        handshake[y] += 1
    elif people[x] == 1 and handshake[x] < K:
        people[y] = 1
        handshake[x] += 1
    elif people[y] == 1 and handshake[y] < K:
        people[x] = 1
        handshake[y] += 1

print(''.join(str(num) for num in people[1:]))