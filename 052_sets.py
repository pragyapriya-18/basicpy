# Creating a set using {}
a = {1,2,3,4,1}
print(a)
print(type(a))

## Empty set
# Important: This syntax will create an empty dictionary and not an empty set
a = {}
print(type(a))

## An empty set can be creadted using
b = set()
print(type(b))

## Adding values to an empty set
b.add(5)
b.add(6) #Adding a value repeatedly does not changes a set 

# b.add([6,5,9]) #Cannot add list to sets
# b.add({6,5,9}) #Cannot add dictionary to sets

b.add((6,2,9)) #We can add tuple to sets
print(b)

## Methods
c = {1,2,3,4,1}
print(c)

## Accessing Elements 
c.add(8)
print(c)

## Length of the set
print(len(c)) # prints the length of this set

## Removal of an item
c.remove(4) # Removes 4 from set c
# c.remove(9) # throws an error while trying to remove 9 (which is not present in the set)
print(c)

print(c.pop())
print(c)

print(c.clear())
print(c)

c.union({8,11})
print(c)

c.intersection({8,11})
print(c)


# ----------------------------------
# -----------------------------------

mydict = {
     "pankha" : "fan",
     "kapda" : "clothe",
     "kitab" : "book"
}
print("options are", mydict.keys())
a = input("enter the hindi word \n")
# print("the meaning of your word is:" , mydict[a]) #Show the error if the key is not present 

# Below line will not throw an error if the key is not present in the dictionary
print("the meaning of your word is:" , mydict.get(a))

# --------------------------------------------

s= {18,"18", 18.1} # using int,str,float
print(s)

# --------------------------------------------
# Check the len of given pg
s = { 20,20.0,"20"}
print(s)
print(len(s))

# ------------------------------------------
#Check the type of given pg
s = {}
print(type(s)) #dict

s= set()
print(type(s)) #set

# --------------------------------------------

