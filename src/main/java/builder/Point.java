package builder;

import java.time.LocalDateTime;

public class Point {

   private double lat;

    private double lon;

    int elevation;

    private LocalDateTime dateTime;

    public Point(double lat, double lon, int elevation, LocalDateTime dateTime) {
        this.lat = lat;
        this.lon = lon;
        this.elevation = elevation;
        this.dateTime = dateTime;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
