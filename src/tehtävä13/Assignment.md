# Visitor

tee a) tai b)

a) Pohdi voitaisiinko Visitor-mallia käyttää State-mallin kontekstiolioiden
käsittelyyn. Kontekstioliot olisivat eri pelihahmoja, jotka ovat eri tiloissa.
Pelissä haluttaisiin käydä kaikki pelihahmot läpi esim. siten että jokaiselle
hahmolle annetaan bonuspisteitä. Annettavien bonuspisteiden määrä voi
riippua kuitenkin hahmosta ja sen tilasta. Bonus-visitorissa on metodi
kunkin hahmon kutakin tilaa kohden. Esitä tällainen bonuspisteiden
jakaminen Java-koodina.

Toteutuksesta: Kontekstioliolle sanotaan accept(visitor), joka delegoi
pyynnön tilaoliolleen.

b) Voitaisiinko State-mallia käytettäessä päätös seuraavasta tilasta (=
tilanvaihto) ulkoistaa Visitoriin. Tilaolio tai konteksti kutsuisi kunkin metodin
lopuksi Visitoria (accept-kutsua ei tarvittaisi), joka tekee päätöksen
mahdollisesta tilan vaihdosta. Esitä Java-koodina. 
