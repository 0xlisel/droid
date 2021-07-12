public class Droid {
    String name;
    int batteryLevel;

    // Constructor
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // toString() method
    public String toString(){
        return "Hey there, I'm " + name + " the droid!";
    }

    // Performing a task
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // Energy report
    public void energyReport(){
        System.out.println("Battery level: " + batteryLevel);
    }

    // Main method
    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid);
        myDroid.performTask("Coding");
        myDroid.energyReport();
    }
}