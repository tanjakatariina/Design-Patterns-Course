# Strategy

tee a) tai b)

a) Määrittele Strategy-mallin mukaisesti ListConverter-rajapinta, jossa
määritellään listToString-metodi, joka saa parametrikseen Listtietorakenteen ja palauttaa listan merkkijonona, jossa 
1. strategia kirjoittaa rivinvaihtomerkin jokaisen alkion jälkeen
2. strategia tulostaa rivinvaihtomerkin joka toisen alkion jälkeen
3. strategia tulostaa rivinvaihtomerkin joka kolmannen alkion jälkeen

Toteuta eri strategioissa listan läpikäynti eri tavoin.
Eri tapoja:
- iteraattorin käyttö
- lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa
- listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.

Kontekstissa luodaan lista ja testiohjelmassa tulostetaan eri strategioilla
aikaansaatu lopputulos. 

b) Toteuta vähintään kolme erilaista taulukon lajittelualgoritmia
(lähdekoodeja esim. https://java2novice.com/java-sorting-algorithms/. Esitä
sovellus, jossa lajittelualgoritmin valinta toteutetaan Strategy-mallin
mukaisesti. Generoi tarpeeksi suuri lajiteltava aineisto ja mittaa lajitteluun
kuluvat ajat. 
