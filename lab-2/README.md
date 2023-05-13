You are supposed to create a menu-driven program that has the following menu options:
Enter a name
Search for a name
Remove a name
Show all names
Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.
Constraints:
The names collected must be stored in an array with a max length of 1024.
The names in the array should be UNIQUE; no duplicate entries are expected!
Provide necessary validations that the user enters only valid names that are not going to be repeated.
Removing a name should not create empty space inside the array!
Format your results properly!!

Process

Start
Initialize an empty List of strings called 'names'
Take user input for choice using a do-while loop
Display a menu with the following options:
a. Enter a name
b. Search for a name
c. Remove a name
d. Show all names
e. Exit
Take user input for the choice selected
Check the entered choice using a switch-case statement
If choice is 1, take user input for a name and add it to the list 'names'
If choice is 2, take user input for a name and check if it exists in the list 'names'
a. If the name exists in the list, print "Name found in the list."
b. If the name does not exist in the list, print "Name not found in the list."
If choice is 3, take user input for a name and remove it from the list 'names'
a. If the name is successfully removed from the list, print "Name removed from the list."
b. If the name does not exist in the list, print "Name not found in the list."
If choice is 4, display all the names in the list 'names'
If choice is 5, print "Exiting the program..." and exit the loop
If the entered choice is invalid, print "Invalid choice. Try again."
Repeat steps 3 to 12 until the choice is 5
Close the Scanner object
End

OUTPUT
PS C:\Users\morri>  & 'C:\Program Files\Java\jdk-11.0.17\bin\java.exe' '-cp' 'C:\Users\morri\AppData\Local\Temp\vscodesws_61300\jdt_ws\jdt.ls-java-project\bin' 'menu'
Menu Options:
1. Enter a name     
2. Search for a name
3. Remove a name    
4. Show all names   
5. Exit
Enter your choice: 1
Enter the name: Morries
Menu Options:       
1. Enter a name     
2. Search for a name
3. Remove a name    
4. Show all names   
5. Exit
Enter your choice: 2
Enter the name to search for: Morries
Name found in the list.
Menu Options:
1. Enter a name        
2. Search for a name   
3. Remove a name
4. Show all names
5. Exit
Enter your choice: 4
All names: [Morries]
Menu Options:
1. Enter a name
2. Search for a name
3. Remove a name
4. Show all names
5. Exit
Enter your choice:    


