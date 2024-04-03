class Person:
    def __init__(self, name, address, area):
        self.name = name
        self.address = address
        self.area = area

n = int(input())

people = []
for _ in range(n):
    name, address, area = tuple(input().split())
    people.append(Person(name, address, area))

sorted_people = sorted(people, key=lambda Person: Person.name, reverse=True)

print(f"name {sorted_people[0].name}")
print(f"addr {sorted_people[0].address}")
print(f"city {sorted_people[0].area}")