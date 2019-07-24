
cities = { 'London': {"john": 54}}

#print(cities['London']['joe'])
print(cities.get('London').get('joe'))
#print(cities.get('Paris').get('joe'))
print(cities.get('Paris', {}).get('joe', 'N/A'))
