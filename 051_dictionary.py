myDict = {
    "Fast" : "In a quick manner",
    "Harry" : "A coder",
    "Marks" : [1,2,5],
    "anotherdict" : {'harry' : 'player'}
}
print(myDict)
print(myDict["Fast"])
print(myDict["Harry"])
print(myDict["Marks"])

#Change the value of dictionary using 
myDict["Marks"] = [45,78]

print(myDict["Marks"])
print(myDict['anotherdict']["harry"])
 