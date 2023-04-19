package Ejercicio;

import java.io.*;
import java.util.ArrayList;

public class personas {
public static void main(String[] args) {
    ArrayList<String> mujeresArray = new ArrayList<>();

    ArrayList<String> hombresArray = new ArrayList<>();

    ArrayList<String> apellidosArray = new ArrayList<>();
   
 try{
    PrintWriter pw= new PrintWriter("C:\\Users\\julia\\eclipse-workspace\\Flujos\\src\\Ejercicio\\fichero.txt", "UTF-8");
    File mujeres = new File("C:\\Users\\julia\\eclipse-workspace\\Flujos\\src\\Ejercicio\\mujeres.txt");
    File hombres = new File("C:\\Users\\julia\\eclipse-workspace\\Flujos\\src\\Ejercicio\\hombres.txt");
    File apellidos = new File("C:\\Users\\julia\\eclipse-workspace\\Flujos\\src\\Ejercicio\\apellidos.txt");

     mBuffer(mujeres, mujeresArray);
     mBuffer(hombres, hombresArray);
     mBuffer(apellidos, apellidosArray);
    
     for (int i = 0; i < mujeresArray.size()&& i< hombresArray.size() && i< apellidosArray.size(); i++) {
        int posmujeres= posrandom(mujeresArray);
        int poshombres =posrandom(hombresArray);

        pw.println(mujeresArray.get(posmujeres)+apellidosArray.get(posrandom(apellidosArray))+apellidosArray.get(posrandom(apellidosArray))+" "+ "M");
        mujeresArray.remove(posmujeres);
      
        pw.println(hombresArray.get(poshombres)+apellidosArray.get(posrandom(apellidosArray))+apellidosArray.get(posrandom(apellidosArray))+" "+"H");
        hombresArray.remove(poshombres);
    }
pw.close();
  }catch(Exception e){
    System.out.println("Error de escritura"+ e.getMessage());
  }   

}
public static ArrayList<String> mBuffer(File prueba, ArrayList <String>Array) throws IOException{

    BufferedReader br = new BufferedReader(new FileReader(prueba));
    String linea;
     while((linea=br.readLine())!=null)
        Array.add(linea);
        br.close();

    return Array ;
}

public static int posrandom (ArrayList array){
    int pos = (int)(Math.random()*array.size());

    return pos;
    
}

}
