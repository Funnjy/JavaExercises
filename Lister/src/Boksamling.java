/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton
 */
//Boksamling.java
import javax.swing.JFrame;
import lister.Bokhylle;

public class Boksamling
{
  public static void main( String[] args )
  {
    Bokhylle hylle = new Bokhylle();
    hylle.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}