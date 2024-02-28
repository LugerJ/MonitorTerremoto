package sutaspjem.org.monitorterremoto;

import java.util.Objects;

public class EarthQuake {
    private String id;
    private String places;
    private Double magnitud;
    private long time;
    private double latitude;
    private double longitud;

    public EarthQuake(String id, String places, Double magnitud, long time, double latitude, double longitud) {
        this.id = id;
        this.places = places;
        this.magnitud = magnitud;
        this.time = time;
        this.latitude = latitude;
        this.longitud = longitud;
    }

    public String getId() {
        return id;
    }

    public String getPlaces() {
        return places;
    }

    public Double getMagnitud() {
        return magnitud;
    }

    public long getTime() {
        return time;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EarthQuake that = (EarthQuake) o;
        return time == that.time && Double.compare(that.latitude, latitude) == 0 && Double.compare(that.longitud, longitud) == 0 && id.equals(that.id) && places.equals(that.places) && magnitud.equals(that.magnitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, places, magnitud, time, latitude, longitud);
    }
}
