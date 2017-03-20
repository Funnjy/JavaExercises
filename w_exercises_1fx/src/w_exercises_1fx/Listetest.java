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
//Listetest.java
//Testklasse for Liste-klassen

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listetest extends JFrame
{
  private JTextField input, inputb, inputs;//, input2, input3;
  private JTextArea lista;
  private JButton slettF, slettS;
  private Liste heltallsliste;
  private Kommandolytter lytteren;

  public Listetest()
  {
    super( "Test av listeklasse" );
    lytteren = new Kommandolytter();

    Container c = getContentPane();
    c.setLayout( new FlowLayout() );
    c.add( new JLabel( "Sett inn forrest(heltall):" ) );
    input = new JTextField( 10 );
    input.addActionListener( lytteren );
    c.add( input );

    c.add( new JLabel( "Sett inn bakerst:" ) );
    inputb = new JTextField( 10 );
    inputb.addActionListener( lytteren );
    c.add( inputb );

    slettF = new JButton("Slett første");
    slettF.addActionListener(lytteren);
    c.add(slettF);

    slettS = new JButton("Slett siste");
	  slettS.addActionListener(lytteren);
    c.add(slettS);

    lista = new JTextArea( 10, 20);
    lista.setEditable( false );
    c.add( new JScrollPane( lista ) );

    heltallsliste = new Liste();
    setSize( 300, 400 );
    setVisible(true);
  }

  //leser inn heltall fra brukeren og setter det inn
  // forrest i lista heltallsliste
  public void settInnForrest()
  {
    int t = Integer.parseInt( input.getText() );
    heltallsliste.settInnForrest( t );
    input.setText( "" );
  }

  //leser inn heltall fra brukeren og setter det inn
  // bakerst i lista heltallsliste
  public void settInnBakerst()
  {
    int t = Integer.parseInt( inputb.getText() );
    heltallsliste.settInnBakerst( t );
    inputb.setText( "" );
  }

  public void skrivListe()
  {
    heltallsliste.skrivListe(lista);
  }

  public void fjernFørsteElement()
  {
    Node fjernet = heltallsliste.fjernFørste();
    if (fjernet !=null)
    {
     lista.setText("\t"+ fjernet.getInfo() +" er fjernet fra listen.");
    }
    else
      lista.setText("Tom liste");
  }

	public void fjernSisteElement()
	{
	  Node fjernet = heltallsliste.fjernSiste();
	  if (fjernet !=null)
	  {
	     lista.setText("\t"+ fjernet.getInfo() +" er fjernet fra listen.");
	  }
	  else
	     lista.setText("Tom liste");
	}

  public static void main( String[] args )
  {
    Listetest vindu = new Listetest();
    vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  private class Kommandolytter implements ActionListener
  {
   public void actionPerformed( ActionEvent e )
   {
		 if( e.getSource() == input )
		 {
			     settInnForrest();
			     skrivListe();
     }
     else if( e.getSource() == inputb )
		 {
			   settInnBakerst();
			   skrivListe();
     }
     else if( e.getSource() == slettF )
     {
        fjernFørsteElement();
        skrivListe();
     }

     else if( e.getSource() == slettS )
     {
        fjernSisteElement();
        skrivListe();
     }
    }
  }
}






