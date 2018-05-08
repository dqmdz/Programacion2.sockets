package ar.edu.um.programacion2.socketobject;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServer {
	public static void main(String arg[]) throws Exception {

		// Server will be started on 1700 port number
		ServerSocket server = new ServerSocket(1700);

		// Server listening for connection
		Socket s = server.accept();

		// Stream object for sending object
		ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());

		os.writeObject(new Student(12, "Pankaj", "M.tech"));

		s.close();
	}
}
