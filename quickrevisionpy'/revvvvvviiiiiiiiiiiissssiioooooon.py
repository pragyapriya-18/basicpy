# from queue import Queue

# graph = {2:[3,4,5],5:[5,2,9],9:[7,5,8]}
# print("graph is")
# print(graph)

# def bfs(input_graph,source):
#     q = Queue()
#     visited_list = list()
#     q.put(source)
#     visited_list.append(source)

#     while not q.empty():
#         pp = q.get()
#         print(pp,end=" " )
#         if pp in input_graph:
#             for u in input_graph[pp]:
#                 if u not in visited_list:
#                     q.put(u)
#                     visited_list.append(u)

# print("graph is")
# bfs(graph,2)


# bubble

# def bb(arr):
#     n = len(arr)
#     for i in range(n-1):
#         for j in range(0,n-i-1):
#             if arr[j]>arr[j+1]:
#                 arr[j],arr[j+1] = arr[j+1],arr[j]

# arr = [2,45,7,69,3]

# bb(arr)
# print(arr)

# Quick sort

# def pivot(array,start,end):
#     pivott = array[start]
#     low = start + 1
#     high = end
#     while True:
#         while low <= high and array[high]>=pivott:
#             high = high-1
#         while low <= high and array[low] <= pivott:
#             low = low+1
#         if low <= high:
#             array[low],array[high] = array[high],array[low]
#         else:
#             break

#     array[start],array[high] = array[high],array[start]
#     return high

# def qs(array,start,end):
#     if start>=end:
#         return
#     p = pivot(array,start,end)
#     qs(array,start,p-1)
#     qs(array,p+1,end)

# array= [4,2,5,7]
# qs(array,0,len(array)-1)
# print(array)
    

# toh

# def toh (disk,source,target,auxliary):
#     if(disk==1):
#         print("move disk 1 from rod {} to rod {}.".format(source,target))
#         return

#     toh (disk-1,source,auxliary,target)
#     print("move disk {} from rod {} to rod {}.".format(disk,source,target))
#     toh(disk-1,auxliary,source,target)

# diskS = int(input("enter the number of disk"))
# toh(diskS,"A" , "B" ,"C")


# import matplotlib.pyplot as p

# x = [2,4,7,9]

# y = [3.45,6.87,6.54,2.98]

# p.plot(x,y)
# p.xlabel('x axis,(4)')

# p.ylabel('y axis,(3.45)')

# p.show()
