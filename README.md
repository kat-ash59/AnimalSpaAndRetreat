# AnimalSpaAndRetreat


### Description
We're excited to announce the COMPLETION of building out our NEW Animal Retreat and Spa Resort.
We welcome our non-human guests, and invite them all to luxuriate in delight!
We hired the best attendant on the planet to provide for all our guests.


### Technologies Used
Scanner
while loops
for loops
arrays
public static final
lots of separate methods to get code a bit dryer


### Lessons Learned
Use Sysout to test as you build and add if (debug == true) around it so you
can turn them off and on without having to worry about going back and deleting them

Build a little Test a little - cheep cheep cheep - build a little test a little - cheep

if reading from scanner an reading nextInt, nextDouble, nextChar
you MUST cleanup after and use a nextLine to gobble up <cr> that is entered



### Checklist

Animal Class Hierarchy
You will create an Animal class defining properties common to all animals like name, a common greeting (some would consider their greeting a noise, but it's their way of saying Hello), etc.

You will also create specific animal subclasses that define the state and behavior unique to that kind-of animal.

public class Animal
Fields:
name
noise

A private name field.
Methods:

Public get and set methods for the name field and any additional private fields you may add.
A public void makeNoise method that prints a string (a simple output like "I am Animal, growling with delight" is fine).

An eat method that takes an int parameter (the amount of food it is being fed), and displays something like "Don't bother me, I'm eating ... lbs of food" (where ... is the value of the int parameter).

Animal Subclasses
Your animal retreat must have room for at least 10 kinds of Animals. They do not expect to fill every room when they open, but there are at least 3 of your animal subclasses that made early reservations that will occupy the spa when open (1 of each kind-of subclass you've created).

Examples: Hippo, Tarantula, Dragon, Xenomorph

Each subclass will have the following:

Fields:

Each subclass will have a private String noise field set to the noise that species of animal makes ("Chomp chomp chomp" for hippo, "Quack" for duck, "Sizzle" for xenomorph, etc.).




completed in class 09/21/2024


