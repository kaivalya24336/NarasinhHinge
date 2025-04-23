Base class (Parent)
class Animal:
    def init(self, name):
        self.name = name

    def sound(self):
        return "Animal sound"

 Derived class (Child of Animal)
class Mammal(Animal):
    def init(self, name, has_fur):
        # Call the constructor of the base class (Animal)
        super().init(name)
        self.has_fur = has_fur

    def breathe(self):
        return "Breathing air"

Further Derived class (Child of Mammal)
class Dog(Mammal):
    def init(self, name, has_fur, breed):
        # Call the constructor of the base class (Mammal)
        super().init(name, has_fur)
        self.breed = breed

    def speak(self):
        return "Bark!"

 Creating an object of the Dog class
dog = Dog("Buddy", True, "Golden Retriever")

 Accessing methods from all the classes
print(f"Dog's Name: {dog.name}")
print(f"Does the dog have fur? {dog.has_fur}")
print(f"Breed: {dog.breed}")
print(dog.sound())  # From Animal class
print(dog.breathe())  # From Mammal class
print(dog.speak())  # From Dog class
