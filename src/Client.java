import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class Client {
    public static void main (String[] args) throws IOException {
        byte[] message = "Today is Friday".getBytes();
        DatagramPacket packet = new DatagramPacket(message,
                message.length,InetAddress.getLocalHost(),7321);
        DatagramSocket socket = new DatagramSocket();
        for (int i = 0; i < 5; i++) {
            socket.send(packet);
        }
    }
}
