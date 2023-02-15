import java.io.IOException;

public class MainUDPClientTasca1 {
    public static void main(String[] args) {
        UDPClientTasca1 client = new UDPClientTasca1();
        try {
            client.init("localhost",5555);
            client.runClient();
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
