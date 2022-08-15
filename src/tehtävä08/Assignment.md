# Template Method

Alla oleva Template Method -malliin perustuva kehys
määrittelee yleisen pelin kulun. Toteuta siihen perustuen jokin
yksinkertainen toimiva peli

```java
/**
 * An abstract class that is common to several games in
 * which players play against the others, but only one is
 * playing at a given time.
 */
abstract class Game {
  protected int playersCount;
  abstract void initializeGame();
  abstract void makePlay(int player);
  abstract boolean endOfGame();
  abstract void printWinner();
  
   /* A template method : */
  public final void playOneGame(int playersCount) {
    this.playersCount = playersCount;
    initializeGame();
    int j = 0;
    while (!endOfGame()){
      makePlay(j);
      j = (j + 1) % playersCount;
    }
   printWinner();
  }
}
```

Now we can extend this class in order to implement actual games:
```java
class Monopoly extends Game {
  /* Implementation of necessary concrete methods */
  void initializeGame() {
  // ...
  }
  void makePlay(int player) {
  // ...
  }
   boolean endOfGame() {
  // ...
  }
  void printWinner() {
  // ...
  }
  /* Specific declarations for the Monopoly game. */
  // ...
  }
  
  class Chess extends Game {
  /* Implementation of necessary concrete methods */
  void initializeGame() {
  // ...
  }
  void makePlay(int player) {
  // ...
  }
  boolean endOfGame() {
  // ...
  }
  void printWinner() {
  // ...
  }
  /* Specific declarations for the chess game. */
  // ...
  }
```
