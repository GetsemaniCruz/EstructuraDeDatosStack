import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<String> paginas = new ArrayDeque<>();//este es el recomendado
        //agregar
        paginas.push("https://shop.conangray.com/");
        paginas.push("https://www.arianagrande.com/");
        paginas.push("https://www.vogue.mx/");
        //recorrido
        for(String pagina: paginas){
            System.out.println(pagina);
        }
        //quitar
        System.out.println("quitando a: "+ paginas.pop());
        System.out.println("Estas en la pagina: " + paginas.peek());

        paginas.push("https:dreamperfectregime.com/");
        paginas.push("Pagina nueva");
        paginas.pop();
        System.out.println("Stack "+ paginas);

        for (String pagina : paginas){
            System.out.println(pagina);
        }
    }
}
