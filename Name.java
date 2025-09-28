public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    // только личное имя
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // фамилия + личное имя
    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // фамилия + личное имя + отчество
    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null) {
            sb.append(lastName).append(" ");
        }
        if (firstName != null) {
            sb.append(firstName).append(" ");
        }
        if (patronymic != null) {
            sb.append(patronymic);
        }
        return sb.toString().trim();
    }
}
