# Break statement:--->
# for i in range(10):
#     print(i)
#     if i == 5:
#         break
# else:
#     print("This is inside else of for") # Runs only if loop wasn't broken


# Continue statement:--->
# for i in range(10):
#     if i == 5:
#         continue
#     print(i)


# Pass statement:---> (It's a null statement)
# i = 4

# Function:--->
# def run(player):
#     pass

# def ouch(player):
#     pass

# Statement/loop condition:--->
# if i >0:
#     pass
# while i>6:
#     pass

# print("pp")


# ps:--->
# 1).
# num = int(input("enter the number"))
# for i in range(1,11):
#     print(str(num)+"X"+str(i)+"="+str(i*num))
    # print(f"{num}X{i} = {num*i}")  # (f-string)


# 2).
# l1 = ["harry","sohan","sachin","rahul"]

# for name in l1:
#     if name.startswith("s"):
#         print("Hello" + name)


# 3).
# num = int(input("Enter the number:"))
# prime = True

# for i in range(2, num):
#     if(num%i == 0):
#         prime = False
#         break
# if prime:
#     print("This number is prime")
# else:
#     print("This number is not prime")


# 4).FACTORIAL:--->
# n! = 1 X 2 X 3 X .......X n 
# 5! = 1 X 2 X 3 X 4 X 5

# num = int(input("Enter the number:"))
# factorial = 1
# for i in range(1, num+1):
#     factorial = factorial * i
# print(f"the factorial of {num} number is {factorial}")


# 5).
# n = 4

# for i in range(4):
#     print("*" * (i+1))

# 6).
n = 3
for i in range(3):
        print(" " * (n-i-1),end = "")
        print("*" * (2*i+1),end = "")
        print(" " * (n-i-1))
