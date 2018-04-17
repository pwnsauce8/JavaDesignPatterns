package Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {

        // Create skills to our Java Developer
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        // Create new Java Developer(JD)
        JavaDeveloper javaDeveloper = new JavaDeveloper("Mukanova Zhanel", skills);

        // Create Iterator for JD
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        // Take all JD skills
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
