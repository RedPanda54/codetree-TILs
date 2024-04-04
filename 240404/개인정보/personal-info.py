class Student:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

students = []
for _ in range(5):
    name, height, weight = input().split()
    height = int(height)
    weight = float(weight)
    students.append(Student(name, height, weight))

students.sort(key=lambda Student: Student.name)

print("name")
for student in students:
    print(f"{student.name} {student.height} {student.weight}")
    
students.sort(key=lambda Student: -Student.height)

print()

print("height")
for student in students:
    print(f"{student.name} {student.height} {student.weight}")