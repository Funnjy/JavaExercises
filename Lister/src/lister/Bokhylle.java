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
//Test av enkel bokliste.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bokhylle extends JFrame
{
  private Bokliste bøkene;
  private JTextField tittel;
  private JButton skrivUt;
  private JTextArea utskrift;
  private Kommandolytter lytter;

  public Bokhylle()
  {
    super( "Test av bokliste" );
    bøkene = new Bokliste();
    Container c = getContentPane();
    c.setLayout( new FlowLayout() );
    c.add( new JLabel( "Ny boktittel: " ) );
    tittel = new JTextField( 25 );
    c.add( tittel );
    skrivUt = new JButton( "Skriv bokliste" );
    c.add( skrivUt );
    utskrift = new JTextArea( 10, 30 );
    utskrift.setEditable( false );
    c.add( new JScrollPane( utskrift ) );
    lytter = new Kommandolytter();
    tittel.addActionListener( lytter );
    skrivUt.addActionListener( lytter );
    setSize( 400, 300 );
    setVisible( true );
  }

  public void settInnBok()
  {
    Book ny = new Book( tittel.getText() );
    bøkene.settInn( ny );
    tittel.setText( "" );
  }

  public void skrivBokliste()
  {
    utskrift.setText( bøkene.toString() );
  }

  private class Kommandolytter implements ActionListener
  {
    public void actionPerformed( ActionEvent e )
    {
      if ( e.getSource() == tittel )
        settInnBok();
      else if ( e.getSource() == skrivUt )
        skrivBokliste();
    }
  }
}