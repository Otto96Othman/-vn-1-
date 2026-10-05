public class PersonCard {
    public static void main(String[] args) {
        // Lägg övningens kod här.
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true;

        System.out.println("Förnamn: " + firstName);
        System.out.println("Efternamn: " + lastName);
        System.out.println("Age:" + age);
        System.out.println("Height: " + height);
        System.out.println("Grade:" + grade);
        System.out.println("Likes Java" + likesJava);


        int ageNextYear = age + 1;
        System.out.println("Nästa år är " + firstName + ageNextYear + "år.");


        String bil = "Volvo";
        int år = 2022;
        double kostnad = 185000;
        boolean el = true;
        System.out.println("detta är en " + bil + " årsmodel " + år + kostnad + el);

    }
        
    
}
