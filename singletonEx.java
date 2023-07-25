package designPattens;

public class singletonEx {
    private static singletonEx instance;

    private singletonEx() {
        //constructor
    };

    public static singletonEx getInstance(){
            if (instance==null)
            {
                instance = new singletonEx();
            }

                return instance;

    }
}
