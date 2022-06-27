package tourGuide.dto;

import gpsUtil.location.Attraction;
import gpsUtil.location.Location;
import tourGuide.user.User;


public class NearestAttraction {

    private String attractionName;
    private Location attractionLocation;
    private Location userLocation;
    private int distance;
    private int rewardPoints;

    public NearestAttraction(Attraction attraction, User user) {
        this.attractionName = attraction.attractionName;
        this.attractionLocation = attraction;
        this.userLocation = user.getLastVisitedLocation().location;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
