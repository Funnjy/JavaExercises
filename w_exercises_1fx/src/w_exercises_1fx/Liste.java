/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w_exercises_1fx;

import javax.swing.JTextArea;

/**
 *
 * @author Anton
 */
public class Liste
{
    private Node første;
    private Node løper;

    public void settInnForrest( int verdi )
    {
     // < oppretter og setter inn en ny node forrest i lista >
        løper = første;
        Node ny = new Node(verdi, null);
        ny.neste = første;
        første = ny;
    }

    public void settInnForrest( Node ny )
    {
      //< setter inn forrest i lista noden som er parameter til metoden >
        løper = første;
        ny.neste = første;
        første = ny;
    }

    public void settInnBakerst( int verdi )
    {
    //  < oppretter og setter inn en ny node bakerst i lista >
        løper = første;
        Node ny = new Node(verdi, null);
        while(løper.neste != null){
            løper = løper.neste;
        }
        løper.neste = ny;
    }

    public void settInnBakerst( Node ny )
    {
      //< setter inn bakerst i lista noden som er parameter til metoden >
        løper = første;
        while(løper.neste != null){
            løper = løper.neste;
        }
        løper.neste = ny;
    }

    public Node fjernFørste()
    {
        //< fjerner og returnerer første node i lista,
        // returnerer null i tilfelle lista er tom >
        if(første.neste == null){
            return null; //List is empty
        }
        første = løper.neste;
        return første;
    }

    public Node fjernSiste()
    {
      //< fjerner og returnerer siste node i lista,
      //  returnerer null i tilfelle lista er tom >
        return null;
    }

    public String toString()
    {
      //< returnerer en streng som inneholder alle verdier i lista
      //  med et mellomrom mellom hver verdi. Returnerer en tom streng
      //  i tilfelle lista er tom. >
        return null;
    }
  
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
    public void skrivListe(JTextArea elementer )
	{ elementer.setText("");
	  if ( første==null )
	       elementer.append( "Tom liste\n" );
	     else
	     {
	       Node hjelp = første;
	       while ( hjelp!=null)
	       { elementer.append( hjelp.getInfo()+ " " );
	         hjelp = hjelp.neste;
	       }
	       elementer.append( "\n" );
	     }
	   }
}
