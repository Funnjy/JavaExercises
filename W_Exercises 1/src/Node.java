/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton Ilchenko
 */
class Node
{
  private int info;
  Node neste;
  private Node første = neste;
  public Node( int data, Node etterfølger )
  {
    info = data;
    neste = etterfølger;
  }

  public int getInfo()
  {
    return info;
  }

  public void setInfo( int nyVerdi )
  {
    info = nyVerdi;
  }
  public void fjernSiste(){
     /*Se om første lement er ikke 0(ikke tom liste)*/
     if(første != null){
          /*Se om det andre element er null(1 element i liste)*/
          if(første.neste == null){
              første = null;
          }
          else
              while(første.neste.neste != null){
                  første = første.neste;
              }
              første.neste = null;
     }
     /*Begynn å gå gjennom alle elementer*/
     /*sjekk om neste element er det siste*/
     /*hvis ja,  fjern. Ellers fortsett*/
  }
}
