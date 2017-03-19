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
public class Book {
    private String tittel;
    Book neste;
    
    public Book(String nyTittel){
        tittel = nyTittel;
        neste = null;
    }
    
    public String toString(){ return tittel; } 
}
