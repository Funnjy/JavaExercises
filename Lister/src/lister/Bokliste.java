/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lister;

/**
 *
 * @author Anton
 */
//Representerer en samling av bøker
public class Bokliste
{
  private Book første;

  public Bokliste()
  {
    første = null;
  }

  //Setter inn et nytt Bok-objekt bakerst i lista.
  public void settInn( Book ny )
  {
    if ( første == null )
      første = ny;
    else
    {
      Book løper = første;
      while ( løper.neste != null )
        løper = løper.neste;
      løper.neste = ny;
    }
  }

  //Gjennomløper boklista og returnerer alle boktitlene, 
  //en på hver linje.
  public String toString()
  {
    String resultat = "";
    Book løper = første;

    while ( løper != null )
    {
      resultat += løper.toString() + "\n";
      løper = løper.neste;
    }

    if ( !resultat.equals( "" ) )
      return resultat;
    else
      return "Ingen bøker registrert!";
  }
  //Fjerner første element
  public Book fjernFørste(){
      Book returbok = første;
      if(første != null)    første = første.neste;
      return returbok;
  }
  //Fjerner siste element
  public Book fjernSiste(){
      Book returbok = første, løper = første;
      if(første != null){
          if(løper.neste == null){
              første = null;
          }
          else{
              while(løper.neste.neste != null) løper = løper.neste;
              
              returbok = løper.neste;
              løper.neste = null;
          }
      }
      return returbok;
  }
}