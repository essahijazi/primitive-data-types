# primitive-data-types

- data types built in to the java language
- they are the foundation for which all other data types are built upon
- four categories of primitive data types
	- integers
	- floating points
	- character
	- boolean

*****************************************

integer types

- there are four different integer types and they only difference is the size of storage that each variable takes up. that difference in size of storage that each takes up affect the range of values that can be stored there
  - byte
  - short
  - int
  - long

when using the long value you have to put an L and the end of it

e.g.

long nationalDebt = 1810123234235724L;

*****************************************

floating point types

- stores values containing a fractional value
- supports positive, negative and zero values

float milesInAMarathon = 26.2f;

double atomWidthInMeters = 0.0000000001d;

or 

double atomWidthInMeters = 0.0000000001;

*****************************************

character 

- the char type stores a single unicode character denoted between two single quotes. note, this is different to strings as char's can only store single characters
e.g.

char capitalU = 'U';

because char supports unicode you can specify any valid unicode value by using \u followed by the 4-digit hex value
e.g.

char accentedU = '\u00DA'; //Ú

*****************************************

boolean

- stores true/false values
e.g.

boolean iLoveJava = true;

*****************************************

primitive types stored by value

when i declare int firstValue = 100;
an area of memory is being allocated and it is being called firstValue, the value 100 is then stored in that memory location
the size of memory being allocated depends on the data type of the variable in this case 32 bits because i am using an int

if i declare another variable and assign firstValue to it, i am copying the value stored in firstValue and storing a distinct copy of that value in the other variables memory location.
making changes to one of the values has no effect on the other variables value
