Here is a Python console application that checks if one string is a scrambled version of another:

```python
def check_scramble(str1, str2):
    if sorted(str1) == sorted(str2):
        return True
    else:
        return False

def main():
    str1 = input("Enter the first string: ")
    str2 = input("Enter the second string: ")

    if check_scramble(str1, str2):
        print("The second string is a scrambled version of the first string.")
    else:
        print("The second string is not a scrambled version of the first string.")

if __name__ == "__main__":
    main()
```

You can run this console application, it will ask you to input two strings. It will then check if the second string is a scrambled version of the first string and print the result.