greeting = "Good Morning,"
name = "subhi"
print(type(name))

# Concatenating two string
c = (greeting + name)
print(c)

# -----------------------------

name = "harry"
print(name[3])

# name[3] = "d" --> Does not work (changing)
# Slicing
print(name[1:5])

print(name[:3]) #is same as name[0:4]
print(name[1:]) #is same as name[1:5]

# Negative indices
print(name[-1:-4]) #is same as name[4:0]

# Skip value
name = "HarryIsGood"
print(name[1:8:1])   #[1:4] length,[1]which we want to print
print(name[0::2])   #[2] it'll skip 2nd number{loop}

