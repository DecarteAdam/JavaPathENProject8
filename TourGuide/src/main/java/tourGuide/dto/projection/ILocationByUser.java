package tourGuide.dto.projection;

import gpsUtil.location.Location;

public interface ILocationByUser {

    String getUserId();
    Location getLocation();
}
