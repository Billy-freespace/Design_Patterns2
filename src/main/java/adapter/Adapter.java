package adapter;

public class Adapter implements ClientInterface {
    private Service adaptee;

    public Adapter(){
        adaptee = new Service();
    }

    @Override
    public String method(String data){
        System.out.println("(Adapter.method) Processing data="+data);
        String specialData = convertToServiceFormat(data);
        return adaptee.serviceMethod(specialData);
    }

    private String convertToServiceFormat(String data){
        return "ServiceData(data="+data+")";
    }
}
