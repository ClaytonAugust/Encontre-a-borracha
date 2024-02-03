package classes;
import java.util.Timer;
/*
Classe com um método estático que permite
a criação de um Timer
*/
public class Temporizador {
    Timer timer;
    public static void exibirMensagem(int tempo,
     String mensagem, int tipo)
     {
        Timer timer = new Timer();
        timer.schedule(new TarefaRepetida(mensagem, tipo), 0, tempo * 1000);
     }
}