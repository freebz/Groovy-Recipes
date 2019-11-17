// Sneaking Toward DSLs

def list = []
list.add("Groovy")
list.add "Groovy"
list << "Groovy"


def shoppingList = []
def add = shoppingList.&add
def remove = shoppingList.&remove
add "Milk"
add "Bread"
add "Beer"
remove "Beer"
add "Apple Juice"
print shoppingList
