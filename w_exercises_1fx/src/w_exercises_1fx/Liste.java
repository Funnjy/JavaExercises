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
public class Liste
{
    private Node første;

    public void settInnForrest( int verdi )
    {
     // < oppretter og setter inn en ny node forrest i lista >
        
    }

    public void settInnForrest( Node ny )
    {
      //< setter inn forrest i lista noden som er parameter til metoden >
    }

    public void settInnBakerst( int verdi )
    {
    //  < oppretter og setter inn en ny node bakerst i lista >
    }

    public void settInnBakerst( Node ny )
    {
      //< setter inn bakerst i lista noden som er parameter til metoden >
    }

    /*public Node fjernFørste()
    {
      //< fjerner og returnerer første node i lista,
       // returnerer null i tilfelle lista er tom >
    }*/

    /*public Node fjernSiste()
    {
      //< fjerner og returnerer siste node i lista,
      //  returnerer null i tilfelle lista er tom >
    }*/

   /* public String toString()
    {
      //< returnerer en streng som inneholder alle verdier i lista
      //  med et mellomrom mellom hver verdi. Returnerer en tom streng
      //  i tilfelle lista er tom. >
    }*/
  
    class Node
    {
        private int info;
        Node neste;

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
    }
}