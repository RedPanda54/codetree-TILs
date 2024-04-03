class Agent:
    def __init__(self, name, score):
        self.name = name
        self.score = score

agents = []

for _ in range(5):
    name, score = tuple(input().split())
    score = int(score)
    agents.append(Agent(name, score))

min_score_index = 0
for i in range(len(agents)):
    if i == 0:
        continue
    else:
        if agents[i].score < agents[min_score_index].score:
            min_score_index = i

print(f"{agents[min_score_index].name} {agents[min_score_index].score}")