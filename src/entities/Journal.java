package entities;

import java.time.LocalDate;

public class Journal extends Document {
    private int idJournal;
    private LocalDate releaseMonth;

    public int getIdJournal() {
        return idJournal;
    }

    public void setIdJournal(int idJournal) {
        this.idJournal = idJournal;
    }

    public LocalDate getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(LocalDate releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + getId() +
                ", publisher=" + getPublisher() +
                ", quantities=" + getQuantities() +
                ", idJournal=" + idJournal +
                ", releaseDate=" + releaseMonth +
                '}';
    }
}
