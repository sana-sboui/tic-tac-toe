import org.jetbrains.annotations.NotNull ;
import java.util.* ;
public class Save {
    static String motDePasse;
    static String crypt = "" ;
    public static <motDePasse> String cryptage(@NotNull String motDePasse){
        for (int i = 0 ; i<motDePasse.length() ; i++){
            int a= motDePasse.charAt(i) ;
            int convertedChar=Integer.parseInt(String.valueOf(a));
            int c = convertedChar + 100 ;
            String convertedValue =String.valueOf(c);
            crypt = crypt + convertedValue + 'o' ;
        }
        return (crypt);
    }
    public static <cry> @NotNull String decryptage (String cry) {
        String decrypt = "" ;
        cry = crypt ;
        String[] splitStr = cry.split("o") ;
        for ( int i = 0 ; i< splitStr.length ; i++) {
            int  eachNumb = Integer.parseInt(String.valueOf(splitStr [i]));
            int dec = eachNumb - 100 ;
            char c = (char)dec ;
            decrypt = decrypt + c ;
        }
        return (decrypt) ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter your password") ;
        String motDePasse = sc.nextLine() ;
        System.out.println(cryptage(motDePasse)) ;
        System.out.println(decryptage(crypt)) ;

    }
}
