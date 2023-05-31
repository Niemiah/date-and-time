import java.time.LocalDateTime;

public class Date {
    private LocalDateTime dateTime;

    public Date(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void increaseSeconds(long seconds) {
        dateTime = dateTime.plusSeconds(seconds);
    }

    public void increaseMinutes(long minutes) {
        dateTime = dateTime.plusMinutes(minutes);
    }

    public void increaseHours(long hours) {
        dateTime = dateTime.plusHours(hours);
    }

    public void increaseDays(long days) {
        dateTime = dateTime.plusDays(days);
    }

    public void increaseMonths(long months) {
        dateTime = dateTime.plusMonths(months);
    }

    public void increaseYears(long years) {
        dateTime = dateTime.plusYears(years);
    }
}