package cw2interfejsy;

public interface CzlowiekI 
{
  default String imie()
  {
    String imie = "Daniel";
    return imie;
  }

  default int wiek()
  {
    int wiek = 21;
    return wiek;
  }  
}

