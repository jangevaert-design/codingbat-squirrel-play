public class squirrelPlay {
  public boolean squirrelPlay(int temp, boolean isSummer) {
    return ((temp > 59 && temp < 91 && !isSummer)
        || (temp > 59 && temp < 101 && isSummer));
  }

}
