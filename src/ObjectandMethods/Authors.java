package ObjectandMethods;

import java.util.Objects;

public class Authors {
    private final String first;
    private final String second;

    public Authors(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authors authors = (Authors) o;
        return Objects.equals(first, authors.first) && Objects.equals(second, authors.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
