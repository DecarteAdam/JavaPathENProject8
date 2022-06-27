package tourGuide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gpsUtil.GpsUtil;
import rewardCentral.RewardCentral;
import tourGuide.service.RewardsService;

@Configuration
public class TourGuideModule {
	private Logger logger = LoggerFactory.getLogger(TourGuideModule.class);

	@Bean
	public GpsUtil getGpsUtil() {
		logger.info("getGpsUtil");
		return new GpsUtil();
	}
	
	@Bean
	public RewardsService getRewardsService() {

		logger.info("getRewardsService");
		return new RewardsService(getGpsUtil(), getRewardCentral());
	}
	
	@Bean
	public RewardCentral getRewardCentral() {
		logger.info("getRewardCentral");
		return new RewardCentral();
	}
	
}
