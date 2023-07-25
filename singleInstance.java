package designPattens;

public class singleInstance{

    public static void main(String[] args) {


        singletonEx obj1 = singletonEx.getInstance();
        singletonEx obj2 = singletonEx.getInstance();

        System.out.println("hash code of obj1 = "+ obj1.hashCode());
        System.out.println("hash code of obj2 = "+ obj2.hashCode());

        if(obj1==obj2)
        {
            System.out.println("both point to the same instance ");
            System.out.println("Hence it is a singleton class");
        }
        else
            System.out.println("Their is more than one instance present");
    }
}
