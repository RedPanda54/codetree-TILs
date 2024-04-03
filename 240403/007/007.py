class Meeting:
    def __init__(self, secret_code, where, when):
        self.secret_code = secret_code
        self.where = where
        self.when = when

secret_code, where, when = input().split()
meeting = Meeting(secret_code, where, when)
print("secret code :", meeting.secret_code)
print("meeting point :", meeting.where)
print("time :", meeting.when)