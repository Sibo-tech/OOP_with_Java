package Objects_and_Classes.Collator;

public class TestCollator {

    private TestCollator() {}

    public static void main(final String[] args) {

        //Test 1: Check label()
        System.out.println("Test 1");
        Collator collator = new Collator("Collator");
        if (collator.label().equals("Collator")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        collator= new Collator("");
        collator.recordReading(15);
        collator.recordReading(200);
        collator.recordReading(28);
        collator.recordReading(43);
        collator.recordReading(25);
        collator.recordReading(5);
        System.out.println("Test 2");
        if(collator.maximum()==200){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Test 3");
        if(collator.minimum()==5){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Test 4");
        if(collator.average()<=52.67){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Test 5");
        if(collator.numberOfReadings()==6){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}