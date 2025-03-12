import sys

# Check if the number of arguments passed is correct
if len(sys.argv) != 5:
    print("Usage: python my_script.py arg1 arg2")
    sys.exit(1)

# Get the arguments
arg1 = sys.argv[1]
arg2 = sys.argv[2]
arg3 = sys.argv[3]
arg4 = sys.argv[4]
arg5 = sys.argv[5]


# Print the arguments
print("Argument 1:", arg1)
print("Argument 2:", arg2)
print("Argument 3:", arg3)
print("Argument 4:", arg4)
print("Argument 5:", arg5)

