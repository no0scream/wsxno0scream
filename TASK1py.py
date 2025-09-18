# Запись массива данных типа список на Python
my_list = [1, 2, 3]
print(my_list)  # => [1, 2, 3]

# Создание структуры данных типа стек на Python с использованием списка
stack = []
stack.append("anna")
stack.append("elena")
stack.append("katya")
print(stack)  # => ['anna', 'elena', 'katya']

# Извлечение элементов из стека (LIFO)
print(stack.pop())  # => katya
print(stack.pop())  # => elena
print(stack)        # => ['anna']