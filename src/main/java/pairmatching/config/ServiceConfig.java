package pairmatching.config;

import pairmatching.service.ParseService;
import pairmatching.service.WoowaCourseService;

public class ServiceConfig {

	public static ParseService getParseService() {
		return new ParseService();
	}

	public static WoowaCourseService getWoowaCourseService() {
		return new WoowaCourseService(RepositoryConfig.getWoowaCourseRepository());
	}
}
