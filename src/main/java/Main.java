import ClientLogic.Client;
import ServerLogic.Server;

public class Main {
    public static void main(String[] args) {
        if (args[0].contains("--server")) {
            Server server = new Server();
            server.start(80);
            server.stop();
        }
        else if (args[0].contains("--client")) {
            Client client = new Client();
            client.start(80, "127.0.0.1");
            client.sendMessage("this is a test");
            client.stop();
        }

    }
}