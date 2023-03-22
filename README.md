# Wapperende Woensdag - Maart 2023
## Mini Laundry Reservation Kata - JAVA vs .NET
We gaan vandaag volledig uit onze comfortzone en de rollen eens omdraaien. Ben je een .NET developer, dan ga je vandaag in JAVA 
aan de slag en vice versa. Klinkt dat als een leuke uitdaging, hopelijk wel :)

We hebben een hopelijk eenvoudige opdracht bedacht op basis van de laundry reservation kata.

### Reservation API
Maak een API die:
 
- Een datum, tijd, telefoonnummer en e-mailadres accepteert.
- De inpit valideert
- Een beschikbare wasmachine uit de wasmachine API ophaalt
- Een reservering aanmaakt met de input + reserveringsnummer en wasmachinenummer
- De reservering output als JSON

### Machine API
Maak een API die
 
- Een timeslot accepteert (datum / tijd)
- Een beschikbare machine uit een lijst met machines selecteert
- Die machine als gereserveerd kenmerkt
- De gegevens van de machine als resultaat teruggeeft.

### Client
Maak een eenvoudige client om de APIs te testen

# Optioneel
 
 - Gebruik een Cosmos DB om de reserveringen en machines op te slaan
 - Deploy je services naar Azure
 
  Readme JAVA: https://github.com/VXCompany/wapperendewoensdag22032023/blob/main/src/java/readme.md
 Readme .NET: https://github.com/VXCompany/wapperendewoensdag22032023/blob/main/src/net/readme.md
 
 # Benodigdheden
- VSCode of de codespace op github

Volg de volgende stappen om de codespace te gebruiken:

1. Ga naar https://github.com/VXCompany/wapperendewoensdag22032023 en click de groene "code" knop. 

[code dialog](https://snipboard.io/yohBY1.jpg)

2. Click op "new with options", een nieuwe pagina opent

[codespace options](https://snipboard.io/7YPwlG.jpg)

3. Kies .NET of JAVA
4. Create codespace
5. Een browser based instantie van VSCode wordt gestart met de benodigde toolchain.

# Resources
.NET: https://learn.microsoft.com/en-us/aspnet/core/tutorials/first-web-api?view=aspnetcore-7.0&tabs=visual-studio-code
JAVA: 
