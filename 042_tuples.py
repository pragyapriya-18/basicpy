# Creating a tuple using ()
t = (1,2,3,4,5)

t1 =() #Empty tuple
t1 = (1) # Wrong way to declare a tuple with single element
t1 = (1,) #Tuple with single element 
print(t1)

# Printing the elements of a tuple
print(t[0])

# Cannot update the values of a tuple
t[0] = 34 # throws an error 


#Tuple method
# Creating a tuple using ()
t = (1,2,1,3,4,1,5)

print(t.count(1)) #return number of times 1 occurs in t
print(t.index(5)) #search the element


# ------------------------------------------
# ------------------------------------------

# STOREFRUITPG

f1 = input("enter fruit number 1: ")
f2= input("enter fruit number 2: ")
f3= input("enter fruit number 3: ")
f4 = input("enter fruit number 4: ")
f5 = input("enter fruit number 5: ")
f6 = input("enter fruit number 6: ")
f7 = input("enter fruit number 7: ")

myFruitList = [f1, f2, f3, f4, f5, f6, f7]
print(myFruitList)


# Sum a list
a = [25,6,6,8]
print(a[0], a[1], a[2], a[3])
print(sum(a))
