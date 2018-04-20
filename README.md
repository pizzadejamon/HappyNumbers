#Was ist Happy Numbers?

Eine Zahl n aus N ist "glücklich", wenn die wiederholte Berechnung der Summe der Quadrate der einzelnen Ziffern 1 ist.
Beispiel: 	isHappy(10) = true denn 1² + 0² = 1;

Es gibt nur eine unendliche Schleife, die niemals (in endlichen Schritten) zur 1 führt:
4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4

Hinweis: 0 ist keine natürliche Zahl

#Spezifikation

bool isHappy(int n)

#Test Beschreibung

Äquivalenzklassen:

Parameter		|		Äquivalenzklasse						|		Repräsentant
n						Natürliche Zahl ]0, ∞[					|		5, 10
n  						Negative Zahl   ]-∞, 0[					|		-10

Grenzwert Tests:
- Testen mit 0
- Testen mit Zahl mit nur einer Ziffer

Intuitive Testfälle:
	- leere Eingaben (int i; isHappy(i))
	- NULL
	- Große Zahlen
	

