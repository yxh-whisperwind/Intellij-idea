import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Test {

    public static void main (String[] args) throws IOException{
        DatagramSocket datagramSocket = new DatagramSocket(7321,InetAddress.getLocalHost());
        byte[] arr = new byte[1024];
        DatagramPacket packet = new DatagramPacket(arr,arr.length);
        while(true) {
            datagramSocket.receive(packet);
            byte[] b = packet.getData();
            if (b==null) {
                break;
            }
            System.out.println(new String(b));
        }

    }
}
