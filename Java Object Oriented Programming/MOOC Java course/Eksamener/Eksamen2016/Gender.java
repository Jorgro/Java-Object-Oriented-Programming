package Eksamener.Eksamen2016;

/**
 * This class represents the gender of a Person. It cannot be instantiated
 * outside this class. It provides all legal Gender values as static variables.
 */
public class Gender {

    private final String label;

    private Gender(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Gender MALE = new Gender("male"), FEMALE = new Gender("female");

    /**
     * Returns a pre-existing Gender instance for the provided label, or null of
     * there is no such instance.
     * 
     * @param label
     * @return a pre-existing Gender instance
     */
    public static Gender valueOf(String label) {
        return label.equals(MALE.label) ? MALE : label.equals(FEMALE.label) ? FEMALE : null;
    }

}