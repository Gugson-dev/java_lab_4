package cw2klasy;
  public interface CzlowiekI 
  {
    default String imie(){
      String imie = "Daniel";
      return imie;
    }
    default int waga(){
      int waga = 130;
      return waga;
    }  
  }

