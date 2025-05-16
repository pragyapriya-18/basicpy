import time

start_time = time.perf_counter()

def bb(arr):
    n = len(arr)
    for i in range(n-1):
        for j in range(0,n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]

arr = [35,67,35,76,89,64]

bb(arr)
end_time = time.perf_counter()

print("sorted array is",arr)
print("time is",end_time - start_time)