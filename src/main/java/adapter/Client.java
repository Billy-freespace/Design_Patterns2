package adapter;

public class Client {
    public static void main(String[] args) {
        ClientInterface adapter = new Adapter();

        String processedData = adapter.method("abc");
        System.out.println(processedData);
    }
}
