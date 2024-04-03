from datetime import datetime

class Weather:
    def __init__(self, date, day, weather):
        self.date = date
        self.day = day
        self.weather = weather

n = int(input())
arr = [tuple(input().split()) for _ in range(n)]
data = [Weather(date, day, weather) for date, day, weather in arr]

sorted_data = sorted(data, key=lambda Weather : Weather.date)
for data in sorted_data:
    if data.weather == 'Rain':
        print(data.date, data.day, data.weather)
        break
# result = datetime.strptime(data[0].date, "%Y-%m-%d")
# now_index = 0
# for i in range(len(data)):
#     if data[i].weather == 'Rain':
#         temp_date = datetime.strptime(data[i].date, "%Y-%m-%d")
#         if temp_date < result:
#             result = temp_date
#             now_index = i

# print(data[now_index].date, data[now_index].day, data[now_index].weather)