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