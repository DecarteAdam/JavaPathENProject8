package tourGuide.dto;

import gpsUtil.location.Location;
import tourGuide.dto.projection.ILocationByUser;
import tourGuide.user.User;

public class LocationByUser implements ILocationByUser {

    private String userId;
    private Location location;

    public LocationByUser (User user) {
        setUserId(user.getUserId().toString());
        setLocation(user.getLastVisitedLocation().location);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LocationByUser{" +
                "userId=" + userId +
                ", location=" + location +
                '}';
    }
}
