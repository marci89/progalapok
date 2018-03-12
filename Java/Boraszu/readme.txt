
r nevű osztályt. Egy bor objektumról az alábbi attribútumokat szeretnénk tárolni: fajta, évjárat. Az attribútumok legyenek privát láthatóságúak.
Írj konstruktort a Bor osztálynak, amely a paraméterek alapján inicializálja az attribútumokat. Az osztálynak ne legyen default konstruktora.
Írj publikus függvényeket, amelyekkel lekérdezhetőek és módosíthatóak az attribútumok. Módosítás előtt ellenőrizzük, hogy évjáratnak ne lehessen negatív számot megadni.
Definiáld felül a toString() metódust, úgy, hogy az visszatérjen a bor adataival, pl.: Ez egy bor, ami [fajta], melynek évjárata: [evjarat]..
A Bor osztályt helyezd az ital nevű csomagba.
Írj egy Aszu nevű osztályt, amely szintén az ital nevű csomagba legyen helyezve. Ez az osztály származzon a Bor osztályból. Az örökölteken felül egy aszú objektum puttony attribútummal rendelkezik.
Írj konstruktort az Aszu osztálynak, amely két paramétert vár: puttony és évjárat. Ezeknek a paramétereknek megfelelően inicializálja az attribútumokat. A fajta attribútum aszú objektumok esetében mindig "aszu" legyen.
Írj publikus függvényeket, amelyekkel lekérdezhető és módosítható a puttony attribútum. Módosítás előtt ellenőrizzük, hogy egy puttony értéke ne lehessen negatív szám.
Definiáld felül a toString() metódust, úgy, hogy az visszatérjen az aszú adataival, pl.: Ez egy aszú, melynek évjárata: [evjarat] és [puttony] puttonyos..
Írj csomagon kívüli futtatható osztályt. Az osztálynak legyen egy statikus metódusa kiirBor(Bor bor) fejléccel, és a paraméterül kapott Bor objektumot írja ki a konzolra.
A main függvény sorban elemezze a parancssori paramétereket. Amennyiben az adott paraméter "aszu", a következő két paraméter tartalmazza az évjáratot és a puttonyszámot. Amennyiben nem "aszu", akkor csak az évjárat következik. Az így értelmezett paramétereknek megfelelően hozzunk létre Bor és Aszu objektumokat, majd írjuk ki őket a konzolra, a kiirBor metódus segítségével.
A megírt osztályokat dokumentált javadoc kommentekkel, és készíts belőlük javadoc-kal dokumentációt.
