import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Semplice classe per testare i file csv per capire come gestire l'elenco delle canzoni
*/
public class Reader {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){  
        cercaBranoMusicale();
    }

    public static void cercaBranoMusicale(){
        String path = "provaFileCsv.csv";
        String riga = "";
        boolean trovato = false;
        System.out.println("ricerca per Brano(0) o per Autore(1)");
        int scelta = scanner.nextInt();
        
        if(scelta == 0){
            try {
                BufferedReader buffer = new BufferedReader(new FileReader(path));
                System.out.println("Stringa da ricercare");
                String cerca = scanner.next();

                while((riga = buffer.readLine()) != null){
                    int colonna = 0;
                    String[] valoriLetti = riga.split(",");
                    if(valoriLetti[colonna].contains(cerca)){
                        System.out.println(valoriLetti[colonna]);
                        trovato = true;
                    }
                }
                buffer.close();
                }catch (FileNotFoundException e) {
                    System.out.println("File non trovato");
                    e.printStackTrace();  
                }catch(IOException e){
                    e.printStackTrace();
                }
        }else if(scelta == 1){
            try {
                BufferedReader buffer = new BufferedReader(new FileReader(path));
                System.out.println("Stringa da ricercare");
                String cerca = scanner.next();

                while((riga = buffer.readLine()) != null){
                    int colonna = 1;
                    String[] valoriLetti = riga.split(",");
                    if(valoriLetti[colonna].contains(cerca)){
                        System.out.println(valoriLetti[colonna]);
                        trovato = true;
                    }
                }
                buffer.close();
                }catch (FileNotFoundException e) {
                    System.out.println("File non trovato");
                    e.printStackTrace();  
                }catch(IOException e){
                    e.printStackTrace();
                }
        }

        if(trovato == false){
            System.out.println("elemento non trovato");
        }
        
        }
        
    }
