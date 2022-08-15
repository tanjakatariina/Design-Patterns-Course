# Memento

Arvuuttajalla on useita asiakkaita (säikeitä), joita kutakin varten
se arpoo luvun, jota asiakas yrittää arvata toistuvasti. Peli käynnistyy siten,
että asiakas ilmoittautuu peliin mukaan Arvuuttajan liityPeliin()-metodilla
(asiakas välittää itsensä parametrina), Metodissa arvuuttaja arpoo luvun ja
tallentaa sen. 

Perinteinen tapa toteuttaa Arvuuttaja, on määritellä siihen HashMap, jossa
säilytetään asiakaskohtaiset tiedot (key = asiakas, value=luku).
Arvatessaan lukua asiakas välittää arvaus()-kutsussa parametrina itsensä
ja arvauksensa. Paluuarvona on true tai false.
