package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    /**
     * Create developer by speciality we want
     * @param speciality
     * @return Developer
     */
    static DeveloperFactory createDeveloperBySpeciality (String speciality) {

        if (speciality.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();

         else if (speciality.equalsIgnoreCase("c++"))
            return new CppDeveloperFactory();

        else if (speciality.equalsIgnoreCase("php"))
            return new PhpDeveloperFactory();

         else
            throw  new RuntimeException(speciality + " is unknown speciality");
    }
}
