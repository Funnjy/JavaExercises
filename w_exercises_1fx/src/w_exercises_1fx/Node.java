/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w_exercises_1fx;

/**
 *
 * @author Anton
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton Ilchenko
 */
/*class Node
{
    
  private int info;
  Node neste;
  
  private Node første = neste;
  
  public Node( int data, Node etterfølger ){
    info = data;
    neste = etterfølger;
  }
  //I
    int number = 10;
    Node hode = new Node(number, null);
    Node løper = hode;
    while(number < 20){
        løper.neste = new Node(++number, null);
        løper = løper.neste;
    }
  //J
    private Node loper = første;
    while (første.neste != null){
    loper = første.neste;
}
    loper.neste = hode;

  public int getInfo()
  {
    return info;
  }

  public void setInfo( int nyVerdi )
  {
    info = nyVerdi;
  }
  public void fjernSiste(){*/
     /*Se om første lement er ikke 0(ikke tom liste)*/
     /*if(første != null){*/
          /*Se om det andre element er null(1 element i liste)*/
          /*if(første.neste == null){
              første = null;
          }
          else
              while(første.neste.neste != null){
                  første = første.neste;
              }
              første.neste = null;
     }*/
     /*Begynn å gå gjennom alle elementer*/
     /*sjekk om neste element er det siste*/
     /*hvis ja,  fjern. Ellers fortsett*/
//  }
  
  //K
 /* Node løperk = første;
  while(løperk.neste != null){
    Node ny = new Node(0, løperk.neste);
    løperk.neste = ny;
    løper = løper.neste.neste;
}
  
  Node løperl = første;
  while(løprl != null){
    if(løperl.neste != null && løper.neste.getInfor() == 0) 
            løperl.neste = løperl.neste.neste;
   løperl = løperl.neste;
}
  Node løperm = første;
  while(løperm != null){
    if(løperm.neste != null && løper.neste.getInfor() !=0)
        løper.neste = løper.neste.neste;
    løper =  løpr.neste;
}
}
*/