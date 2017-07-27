/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author julia
 */
public class Winkelwagen{

    private static int ID;

    private ArrayList<Artikel> lijst = new ArrayList<>();  //1.kan dat op deze manier een lijst van max 20 objecten maken?
    
    private int aantalArtikelen;

    private int wagenID;

    private float totaalPrijs;



    public void sorteerLijst(){
    Collections.sort(lijst);
    }
    
    public void saveToFile(String s) throws FileNotFoundException, IOException{
    java.io.File file = new java.io.File(s);
    java.io.FileOutputStream output = new java.io.FileOutputStream(file);
    java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(output);
    out.writeObject(this);
    }
    
    public void loadFile(String s){
        //3.en dit ook
    }
    
    public float getTotaalPrijs(){
        float sum = 0;
        for(Artikel a : lijst){
            sum += a.getArtikelPrijs();
        }
        return sum;
    }
    
    @Override
    public Winkelwagen clone() throws CloneNotSupportedException{
        Winkelwagen nieuweWinkelWagen = (Winkelwagen)super.clone();
        return nieuweWinkelWagen;
    //4.wat ik hier niet begrijp is dat je als return een Winkelwagen object hebt,
    //terwijl je de lijst met artikelen moet kopieren..?
    }
    
    public void voegToe(Artikel x) throws IOException{
    int size = 10;
    while(aantalArtikelen<size){
        lijst.add(x); 
        aantalArtikelen++;
    }
        
                }
    }
    
    

    
    

