package entities;

import java.time.LocalDate;

public class Newspaper extends Document {
    private LocalDate releaseDate;

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + getId() +
                ", publisher=" + getPublisher() +
                ", quantities=" + getQuantities() +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
