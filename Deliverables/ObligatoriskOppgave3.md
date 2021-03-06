# INF112 Gruppe 10 - Lag 4 Programmeratene
## Deloppgave 1: Prosjekt og prosjektstruktur
- Møtereferat ligger i egen folder */Meetings.
- Rollene fungerer veldig fint til nå. Alle er tilfreds med sine roller og oppgaver.
- Vi ser fortsatt ikke noen grunn til å legge til eller å fjerne roller.
  * Tech Lead: Teknisk support for hele lag, en sentral rolle for å binde sammen prosjektet.
  * Team Lead: Lagets "leder", han som holder mest orden på møtene og samarbeidsdelene.
  * Project Manager: Tar ansvar for sentrale oppgaver som påvirker prosjektet.
  * Product Owner: Skal holde orden på produktet, sjekke at spillet virker som det skal uten store feil.
  * Subject Matter Expert: En ekspert innenfor spillet. Kjenner reglene og strukturen vesentlig bedre enn de andre.
	
- Valgene vi har tatt for denne obligen har mener vi har vært gode. Vi har valgt å fokusere på å ferdigstille MVP og synkronisere map for både host og clients. Disse målene har vi blitt ferdig med.
- Gruppen har en svært god dynamikk der alle er med og bidrar til arbeidsflyten. Ved hjelp av hyppige møter og bruk av discord gjør det at kommunikasjonen i teamet har vært svært god.
- Vi er fornøyd med arbeidsmetodikken, og ser derfor ingen grunn til å gjøre endringer på dette.
- Vi jobber mye sammen. Vi har hatt en del parprogrammering, der andre kan se på og hjelpe til. Dette har ført til at commitsene er litt skjevfordelt.

- To punkter vi må jobbe med fra Retrospective til neste oblig (ref lengre nede i dokumentet):
  * Bedre fordeling av commits. 
  * Vurdering av arbeidsmengde slik at alle medlemmer får like mye arbeid.

## Deloppgave 2 - Krav
#### Info:
Vi har valgt å beholde de samme brukerhistoriene fra oblig2. Dette er fordi de representerer alle de ni MVP kravene, og det er de vi har fokusert på i denne obligen.
#### Brukerhistorier:
Brukerhistorienene er listet i prioritert rekkefølge
- "Som bruker ønsker jeg å se et spillbrett fordi dette er nødveldig for å kunne spille RoboRally"
	- **Arbeidsoppgaver**
		- Lage et spillbrett med Tiled
		- Vise spillbrettet med libgdx i java
	- **Akseptansekrav**
		- Når spillet starter så dukker det opp et spillbrett
- "Som bruker ønsker jeg å se elementene på brettet for å vite posisjonen til roboten min og posisjonene til andre elementer"
	- **Arbeidsoppgaver**
		- Lage tiles
		- Lage teksturer
		- Implementere grafikken
	- **Akseptansekrav**
		- Om det finnes elementer på brettet så vises disse på det grafiske spillbrettet
- "Som bruker ønsker jeg å flytte brikker på brettet fordi dette er et interaktivt spill"
	- **Arbeidsoppgaver**
		- Implementere logikk for bevegelse
	- **Akseptansekrav**
		- Det går an å gi input til spillet slik at spillerbrikken beveger seg på spillbrettet
- "Som bruker ønsker jeg å kunne besøke flaggene på brettet for å vinne spillet"
	- **Arbeidsoppgaver**
		- Implementere visningsgrafikk for flagg
		- Implementere logikk for besøk av flagg
		- Implementere logikk for seier når alle flagg er besøkt i riktig rekkefølge
	- **Akseptansekrav**
		- Spillerbrikken kan bevege seg til flagg på kartet
		- Om spillerbrikken besøker alle flaggene i riktig rekkefølge vinner spilleren spillet
- "Som bruker ønsker jeg å se andre spillere og se dem flytte seg for å kunne spille flerspiller"
	- **Arbeidsoppgaver**
		- Implementere logikk for flerspiller
		- Implementere grafikk for flere spillere
		- Implementere "turnBase" logikk
	- **Akseptansekrav**
		- To brukere kan være aktiv på samme spillbrett og se hverandres brikker i korrekt posisjon
- "Som bruker ønsker jeg å kunnne bli tildelt kort for å kunne programmere roboten min"
	- **Arbeidsoppgaver**
		- Implementere kort
		- Lage logikk for utdeling av kort
		- Lage logikk for visning av kort til brukeren
	- **Akseptansekrav**
		- Det finnes kort i spillet som kan deles ut til spillerene
		- Hver spiller kan se kortene de har fått tildelt
- "Som bruker ønsker jeg å kunnne "spille" et kort for å bevege roboten min"
	- **Arbeidsoppgaver**
		- Implementere logikk for valgte kort og bevegelse
		- Implementere grafikk som viser at robot har blitt flyttet
	- **Akseptansekrav**
		- Når en spiller legger et kort, beveger roboten seg med henhold til egenskapene til kortet som ble lagt

- Kjente bugs
	- Når en spiller mister alle 3 lifetokens, mister den muligheten til å velge kort. Dette fører til at hosten venter på en packet som aldri kommer og spillet "crasher".
	- Per dags dato, så kan roboten bevege seg utenfor banen. Dette er fordi det ikke er implementert noen logikk for å stoppe dette.
	- Ikke implentert logikk for besøk av flere flagg. Dette medfører til at en spiller vinner ved å treffe et vilkårlig flagg.


###Deloppgave 3
- Se README.md om kjøring av spillet og tester

## Retrospective for Oblig 3
- I denne obligen har vi fokusert på å gjøre ferdig MVP, derav:
	1. Multiplayer, å vise roboter og bevegelser på alle skjermer (ikke bare hos host)
	2. Få til win-condition ved besøk av flagg.
	3. Få til loss-condition ved besøk av hull.
- Ved fullføring av disse, har spillet nå MVP. Dette er vi veldig fornøyde med, siden vi satt oss mål om å bli ferdig med MVP til denne obligen.
- Multiplayer har har vist seg å være en stor oppgave. Vi er derfor veldig stolte av å ha en fungerende multiplayer opplevelse, der alle spillere kan se robotoene bevege seg likt.
- Vi ser at det har vært en positiv forbedring å delegere oppgaver tidligere i prosessen. Dette gjorde det lettere for oss å fokusere på det som måtte gjøres for å gjennomføre målene vi satt oss i starten av denne perioden.
- For neste oblig har vi satt oss som mål å få en mer jevn fordeling av commits og arbeidsfordling.
- Nå som vi er ferdig med MVP, kan vi fokusere på mer brukervennlig GUI. Til nå er spillet spilt i terminalen. Men til neste gang ønsker vi å gjøre det mulig for spilleren å interagere med spillet helt gjennom GUI. Dette vil være ved å velge kort, se healthtokens og lignende slik at spillet føles mer ut som et spill.  
- Vi ønsker å implementere alle brettelementene fra spillet. Vårt første møte etter påskeferien vil være å se på hva som må gjøres for å gjennomføre dette. Samt å delegere arbeidsoppgaver mellom medlemmene slik at vi kan jobbe med å ferdigstille spillet for en full release.
