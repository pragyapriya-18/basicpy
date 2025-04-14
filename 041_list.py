# Create a list using []
a = [1,2,4,65,3]

#Print the list using print() function
print(a)

# Access using indexing using a[0], a[1], a[2]
print(a[4]) 

#Change the value of list using 
a[0] = 98 
print(a)

# We can create a list with items of different types
c = [45, "Harry", False , 6.9]
print(c)


# List slicing
Friends = ["Harry", "Tom", "Sam", "Divya", 45]
print(Friends[0:4])
print(Friends[-4:])


# List method
L1 = [6,91,54,8,7,2]

L1.sort() # Sort the list
print(L1)

L1.reverse() # Reverse the list
print(L1)

L1.append(1) # Add 1 at the end of the list 
print(L1)

L1.insert(2, 5) # Inserts 5 at index 2
print(L1)

L1.pop(2) # Removes element at index 2
print(L1)

L1.remove(91) # Removes 91 from the list 
print(L1)

L1.copy() # Return a shallow copy of the list  
print(L1)

L1.extend([91, 55]) # Add the element at the end(like list or tuple using [])
print(L1)





