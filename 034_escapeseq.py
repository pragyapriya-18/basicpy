story = "harry is good. \n" "he is very good \t" "."

print(story)


# ---------------------------------------------
               
# ---------------------------------------------

name = input("enter ur name\n")
print("good afternoon,", name)

# -------------------------------------

letter = ''' Dear <|NAME|>,
Greetings from ABC coding house. I am happy to tell you about your selection
You are selected!
Have a great day ahead!
Thanks and regards,
Bill
Date: <|DATE|>
'''
name = input("Enter your Name\n")
date = input("Enter Date\n")
letter = letter.replace("<|NAME|>",  name)
letter = letter.replace("<|DATE|>", date)
print(letter)

# --------------------------------------------

st = "This is a string with double  spaces"

doublespaces = st.find("  ")
print(doublespaces)

# -------------------------------------------

st = "This is a string with double  spaces"

st = st.replace("  "," ")
print(st)

# ---------------------------------------------

letter = "Dear Harry,This py course is nice! Thanks!"
print(letter)

Formatted_letter = "Dear Harry, \n\tThis py course is nice!\nThanks!"
print(Formatted_letter)
