import java.io.Serializable;

public class AppleDesignerFactory implements Serializable, Cloneable{
    private static AppleDesignerFactory model;

    private AppleDesignerFactory(){
    }

    public static AppleDesignerFactory getInstance(){

        if (model == null){
            model = new Database();
        }

        return model;
    }

    public void initiate(){
        System.out.println("You are now entering the factory");
    }
}

