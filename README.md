Java Design patterns
====================

# Navigation

1. [Отношения между классами](#_1)
2. [Виды паттернов](#_2)
	* [Поведенческие](#b)
	* [Поздражающие](#c)
	* [Структурные](#s)

# Отношение между классами

```				
						|
1.  -----------◄►		|------- Агрегация (aggregation)
	<----------◄► 		|
						|
2.  -----------<>		|------- Композиция (composition) 
	<----------<>		|	
						|
3.  -------------       |------- Обобщение (generalization)
	------------>		|
						|
4.  - - - - - - -		|------- Зависимость (dependency)
    - - - - - - >		|

```


# Виды паттернов

```

1. +------+	
   |   B  |   ---------- Поведенческие 
   +------+	

2. +------+	
   |   C  |   ---------- Поздражающие	 
   +------+	

3. +------+	
   |   S  |   ---------- Структурные 
   +------+	

```



### B == Поведенчиские

1. [Цепочка обязанностей]()
2. [Команда == Command == Příkaz]()
3. [Интерпретатор]()
4. [Итератор == Iterator == Interátor]()
5. [Посредник]()
6. [Хранитель == Mementor ==]()
7. [Наблюдатель]()
8. [Состояние]()
9. [Стратегия]()
10. [Шаблонный метод]()
11. [Посетитель]()

### C == Подражающие

1. [Абстрактная фабрика]()
2. [Строитель]()
3. [Фабричный метод]() 
4. [Прототип]()
5. [Одиночка == Singelton == Jedináček]()


### S == Струткурные

1. [Адаптер]()
2. [Мост]()
3. [Компоновщик]()
4. [Декоратор]()
5. [Фасад]()
6. [Приспособлинец]()
7. [Прокси]()




# B == Поведенческие 

## 1. [Цепочка обязанностей == Chain of responsibility]()

![corS](https://upload.wikimedia.org/wikipedia/commons/6/6a/W3sDesign_Chain_of_Responsibility_Design_Pattern_UML.jpg)

## 2. [Команда == Command == Příkaz]()
## 3. [Интерпретатор]()
## 4. [Итератор == Iterator == Interátor]()
## 5. [Посредник]()
## 6. [Хранитель == Mementor ==]()
## 7. [Наблюдатель]()
## 8. [Состояние]()
## 9. [Стратегия]()
## 10. [Шаблонный метод]()
## 11. [Посетитель]()

# C == Подражающие 

## 1. [Абстрактная фабрика]()
## 2. [Строитель]()
## 3. [Фабричный метод == Factory Method]() 

#### Цель:
Создание интерфейса, который создаёт объект. При этом, выбор того, экземпляр какого класса создавать
остаётся за классами, которые имплементируют данный интерфейс.

#### Для чего используется:
Для делигирования создания экземпляров, другому классу.


#### Пример использования:

* заранее неизвестно, экземпляры, какого класса нужно будет создавать;
* класс спроектирован таким образом, что создаваемые им объекты имеют свойства определённого класса.

## 4. [Прототип]()
## 5. [Одиночка == Singelton == Jedináček]()


# S == Струткурные

## 1. [Адаптер]()
## 2. [Мост]()
## 3. [Компоновщик]()
## 4. [Декоратор]()
## 5. [Фасад]()
## 6. [Приспособлинец]()
## 7. [Прокси]()