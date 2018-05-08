package ar.edu.um.programacion2.socketobject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class Testing {
	@Test
	public void test() throws UnknownHostException, IOException, ClassNotFoundException {
		Socket socket = new Socket("127.0.0.1", 1700);
		ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
		Student s = (Student) is.readObject();
		s.showDetails();
		socket.close();
	}
}
