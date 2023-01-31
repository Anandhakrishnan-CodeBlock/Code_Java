public class CallByValue_CallByReference
{
    int data = 0;
    public static void main(String[] args)
    {
        // Primitive data type (data)
        int data = 10;
        // call by value
        updateData(data);
        System.out.println("Call by value - outside method "+ data);


        // call by reference
        CallByValue_CallByReference callByReference = new CallByValue_CallByReference();
        callByReference.data = 10;
        updateData(callByReference);
        System.out.println("Call by Reference - outside method "+ callByReference.data);
    }

    // Call by value method
    public static void updateData(int d)
    {
        d= d+d;
        System.out.println("Call by value - inside method "+ d);
    }

    // Call by reference method
    public static void updateData(CallByValue_CallByReference d)
    {
        d.data = 20;
        System.out.println("Call by value - inside method "+ d.data);
    }
}
