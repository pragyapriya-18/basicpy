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

# #Change the value of dictionary using 
myDict["Marks"] = [45,78]

print(myDict["Marks"])
print(myDict['anotherdict']["harry"])
 
#  Dictionary Methods
myDict = {
    "Fast" : "In a quick manner",
    "Harry" : "A coder",
    "Marks" : [1,2,5],
    "anotherdict" : {'harry' : 'player'},
    1:2
}

print(myDict.keys()) # prints the keys of the dictionary
print(type(myDict.keys())) #check the type of the dictionary
print((myDict.values())) # prints the values of the dictionary
print(myDict.items()) # Prints the (key,value) for all contents of the dictionary 

#update the dictionary by adding key-value pairs from updateDict
print("before update", myDict)
UpdateDict = {
    "Lovish" : "Friend",
    "Harry" : "Dancer"
} 
myDict.update(UpdateDict)
print("after update" , myDict)

print(myDict.get("Harry")) # prints value associated with key "harry"
print(myDict["Harry"])  # prints value associated with key "harry"

# The difference between .get and [] syntax in dictionaries?
print(myDict.get("Harry2")) # Returns "None" as Harry2 is not pressent in the dictionary 
print(myDict["Harry"]) # throws an "Error" as Harry2 is not pressent in the dictionary 