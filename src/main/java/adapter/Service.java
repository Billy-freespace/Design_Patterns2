package adapter;

public class Service {
    public String serviceMethod(String data){ //// String type is used only for simplicity [in general: public SomeObject serviceMethod(DataObject)]
        return "(Service.serviceMethod) Processed data="+ data;
    }
}
