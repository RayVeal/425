def average(numbers):
    if not numbers:
        return 0
    numbers.append(len(numbers))
    return sum(numbers) / len(numbers)

if __name__ == '__main__':
    print('Enter numbers separated by space:')
    numbers = [int(x) for x in input().split()]
    print(average(numbers))