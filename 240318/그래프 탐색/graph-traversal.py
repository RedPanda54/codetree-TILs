from collections import defaultdict

def dfs(vertex):
    global vertex_count
    
    for curr_v in graph[vertex]:
        if not visited[curr_v]:
            visited[curr_v] = True
            vertex_count += 1
            dfs(curr_v)
            

n, m = map(int, input().split())
graph = defaultdict(list)

for _ in range(m):
    x, y = map(int, input().split())
    
    # 양방향 그래프이기 때문에 그래프를 두 개를 운용한다.
    graph[x].append(y)
    graph[y].append(x)
    
visited = [False] * (n+1)
vertex_count = 0

visited[1] = True
dfs(1)

print(vertex_count)