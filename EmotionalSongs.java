import java.util.*;
/**All’avvio l’applicazione mostra un menu iniziale dove:
Tutti possono:
• cercare brani con titolo, autore, anno
• visualizzare le emozioni associate a ciascuna canzone selezionata
• registrarsi al’applicazione
Gli utenti registrati possono:
• creare playlist
• inserire le emozioni provate all’ascolto di determinate canzoni*/

public class EmotionalSongs{

    static Scanner scan=new Scanner(System.in);


    public static void DisplayMeny(){

        try{
            System.out.println("Benvenuti in EmotionaSongs\n");
            System.out.println("Cosa si desidera fare?\n \n1- Cercare Brano\n \n2- Visualizzare Emozoni\n \n3- Registrazione\n \n4- Login\n \n");
            System.out.println("Scegliere un opzione (1, 2, 3, 4 o 5):");
            int Choise=scan.nextInt();
            scan.nextLine();

            if (Choise==1){
                System.out.println("Benvenuti in EmotionaSongs");
            }else{
                if(Choise==2){
                    System.out.println("Benvenuti in EmotionaSongs");
                }else{
                    if(Choise==3){
                        System.out.println("Benvenuti in EmotionaSongs");
                    }else{
                        if(Choise==4){

                            System.out.println("Login Part");
                            Boolean Login=true;

                            if (Login==true){

                                    System.out.println("Benvenuto XXXXXX\n \n");
                                    System.out.println("Cosa si desidera fare?\n \n1- Creare Playlist\n \n2- Inserire emozioni\n \n");
                                    System.out.println("Scegliere un opzione (1 o 2):");
                                    int LoggedChoise=scan.nextInt();
                                    scan.nextLine();

                                    if (LoggedChoise==1){
                                        System.out.println("Benvenuti in EmotionaSongs");
                                    }else{
                                        if(LoggedChoise==2){
                                            System.out.println("Benvenuti in EmotionaSongs");
                                        }
                                    }
                                
                            }
                                

                        }
                    }
                }

            }

        }
       
        finally{
            System.out.println("\nScelta non valida");
        }
        
    
    }

    public static void main(String[] args){
        
        DisplayMeny();


        
}
}