# Warm-Up: Of Horses and Stables
Auf einem Bauernhof steht ein Pferdestall in dem verschiedene Pferde Platz haben. Die Pferde haben einen Namen, ein Alter und ein Geschlecht. Einem weiblichen Pferd kann ein Pferd (ein Fohlen) zugeordnet sein. Eine Pferd kann gefragt werden, ob es Kinder hat und wie diese heißen.

In den Stall können Pferde hineingestellt und herausgenommen werden. Außerdem soll der Stall anzeigen wie viele Pferde sich im Stall befinden und eine Namensliste der Pferde generieren können.

## Klasse Horse
### Attribute
| Typ       | Name           | 
|:-------------:|:-------------:|
| String      | name |
| int   | age      |
| String | gender      |
|boolean | hasFoal|
### Methoden
* Getter und Setter für `name`
* Getter für `gender`
* Getter für `age'
* insertFoal(Horse foal)
* nameOfFoal()

## Klasse Stable
### Attribute
| Typ       | Name           | 
|:-------------:|:-------------:|
| List      | horses |
### Methoden
* addHorse(Horse horse)
* removeHorse(Horse horse)
* amountOfHorses()
* whoIsInStable()

Die Methoden des Programms sollen durch Erstellen einer main-Methode in der Klasse Stable geprüft und nachvollzogen werden.
