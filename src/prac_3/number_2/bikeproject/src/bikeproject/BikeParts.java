package prac_3.number_2.bikeproject.src.bikeproject;

public interface BikeParts {
    // Константа с названием компании
    String MAKE = "Oracle Cycles";

    // Методы, которые должны быть реализованы
    String getHandleBars();
    void setHandleBars(String newValue);
    String getTyres();
    void setTyres(String newValue);
    String getSeatType();
    void setSeatType(String newValue);
}