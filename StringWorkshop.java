public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());


        System.out.println("hej jah heter" + firstName + lastName);
        System.out.println("mitt namn innehåller "+ fullName.length());
        
        String city = "GÖteborg";
        String professtion = "mjukvarutestare";

        System.out.println(firstName + lastName + "bor i " + city + "och utbildar sig till" + professtion);
    }
}
