package NET;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(6666);
		while(true) {
			Socket s  = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream()); 
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			ss.close();
			//System.out.println("A client connect!");
		}
	}
}
