package builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TrackBuilder {

    private String name;

    private TrackType type;

    private List<Point> points = new ArrayList<>();

    public TrackBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TrackBuilder withTrackType(TrackType type) {
        this.type = type;
        return this;
    }

    public TrackBuilder withPoint(double lat, double lon, int time,  LocalDateTime dateTime) {
        if (Math.abs(lat) > 90 || Math.abs(lon) > 180) {
            throw new IllegalArgumentException();
        }
        points.add(new Point(lat, lon, time, dateTime));
        return this;
    }

    public Track build() {
        if (name == null) {
            throw new IllegalStateException();
        }
        Track track = new Track();
        track.setName(name);
        track.setTrackType(type);
        track.setPoints(points);
        return track;
    }
}
