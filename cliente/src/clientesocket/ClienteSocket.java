
package clientesocket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ClienteSocket {

   public void enviarmsg(String msg) throws IOException
   {
       String enviar="";
       
       Socket cliente = new Socket("127.0.0.1",8080);
       
       ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
       
       enviar=msg;
       
       saida.writeObject(enviar);
       saida.flush();
       
       saida.close();
       cliente.close();
   }
}
