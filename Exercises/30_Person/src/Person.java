public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //Getter
    public String getFirstName() {
        return this.firstName;
    }

    //Getter
    public String getLastName() {
        return this.lastName;
    }

    //Getter
    public int getAge() {
        return this.age;
    }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Setter
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }

        if (this.firstName.isEmpty()) {
            return this.lastName;
        }

        if (this.lastName.isEmpty()) {
            return this.firstName;
        }

        return this.firstName + " " + this.lastName;
    }
}
