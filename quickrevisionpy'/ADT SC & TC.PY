class student:
    def __init__ (self,name,id,department):
        self.name = name 
        self.id = id
        self.department = department

    def set_name (self,name):
        self.name = name

    def set_id(self,id):
        self.id = id

    def set_department(self,department):
        self.department = department 

    
    def get_name(self):
        return (self.name)
    
    def get_id(self):
        return self.id
    
    def get_department(self):
        return self.department 
    
    def __str__ (self):
        return 'name:' + self.name + '\nid:' + self.id + '\ndepartment:' + self.department    

import time

start_time = time.perf_counter()

def main():
    student1 = student("pragya","233","cse")
    print(student1)

main()

end_time = time.perf_counter()

print("time=",end_time - start_time)

    
