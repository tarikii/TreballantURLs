import java.io.IOException;

public class MainUDPServerTasca1 {
    public static void main(String[] args) throws IOException {
        UDPServerTasca1 servidorTarik = new UDPServerTasca1();
        servidorTarik.init(5555);
        servidorTarik.runServer();
    }
}
