# Exercici 2 – Genèrics amb tipus acotats ('bounded types')

##  Enunciat de l'exercici
Crea una interfície anomenada Phone amb el mètode call().

Després, crea tres classes:
- Smartphone, que implementa Phone i afegeix el mètode takePhoto().
- GenericUtils, amb dos mètodes genèrics:
  1. El primer, anomenat usePhone(), accepta un argument limitat per la interfície Phone (T extends Phone) i crida el mètode call().
  2. El segon, anomenat useSmartphone(), accepta un argument limitat per la classe Smartphone (T extends Smartphone) i crida tant call() com takePhoto().
- Main, amb el mètode main(), on es crea un objecte de tipus Smartphone i es passa a tots dos mètodes de la classe GenericUtils.

## 🛠 Tecnologies
- Backend: Java

##  Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució de l'aplicació.
3. Proves: Executar el `Main()`.

## 📌 Anotacions

**El mètode limitat per la interfície Phone, dins GenericUtils, pot cridar takePhoto()? Per què sí o per què no?**

No, el mètode takePhoto es declara en la subclasse SmartPhone. Per tant, un mètode limitar per la interfície Phone no pot cridar aquest mètode.