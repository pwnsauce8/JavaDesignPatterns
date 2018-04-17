package Iterator;

public class JavaDeveloper implements Collection {

    /* Java Dev. name */
    String name;
    /* Java Dev. skills */
    String[] skills;

    /**
     * Java Developer Constructor
     * @param name    Java Developer name
     * @param skills  Java Developer skills
     */
    public JavaDeveloper(String name, String[] skills) {

        this.name = name;
        this.skills = skills;
    }

    /**
     * getter
     * @return Java Developer name
     */
    public String getName() {
        return name;
    }

    /**
     * set new Java Developper name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter
     * @return Java Developer skills
     */
    public String[] getSkills() {
        return skills;
    }

    /**
     * set new Java Developper skills
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }


    /**
     * @return Java Developer Iterator
     */
    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /**
     *
     */
    private class SkillIterator implements Iterator {
        int index;

        /**
         * Check if the next object exists
         * @return true   if the next object exists
         *         false  if does not exist

         */
        @Override
        public boolean hasNext() {
            if (index < skills.length)
                return true;
            return false;
        }

        /**
         * Gives the next object
         * @return next skill
         */
        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
