package com.app.call;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.app.service.CallService;

@Component
public class VoiceCallNotifications {

	@Autowired
	private CallService phoneService;
	
	//wake up every day at 6:30:00 am
	@Scheduled(cron = "1 30 6 * * *")
	public void wakeUp() {
		System.out.println("Wake Up Time");
		phoneService.makeCall();
	}
	
	//bath at everyday 7:00:00 am
	@Scheduled(cron = "1 1 7 * * *")
	public void bath() {
		System.out.println("bath Time");
		phoneService.makeCall();
	}
	
	//breakfast at everyday 7:30 am
	@Scheduled(cron = "1 30 7 * * *")
	public void breakfast() {
		System.out.println("breakfast Time");
		phoneService.makeCall();
	}
	
	//gardening, taking a walk, listening music daily at 8:00:00 am
	@Scheduled(cron = "1 1 8 * * *")
	public void morningActivities() {
		System.out.println("moning activities Time");
		phoneService.makeCall();
	}
	
	//lunch time at 1:00:00 PM
	@Scheduled(cron = "1 1 13 * * *")
	public void lunchTime() {
		System.out.println("lunch Time");
		phoneService.makeCall();
	}
	
	//Afternoon activities on persons unique interests 
	//like go on outing, solving  crossword puzzels
	//doing crafts or exercising
	@Scheduled(cron = "1 1 14 * * *")
	public void afternoonActivities() {
		System.out.println("afternoon activities Time");
		phoneService.makeCall();
	}
	
	//nap 
	@Scheduled(cron = "1 1 15 * * *")
	public void nap() {
		System.out.println("nap start Time");
		phoneService.makeCall();
	}
	
	//nap end
	@Scheduled(cron = "1 1 16 * * *")
	public void napEnd() {
		System.out.println("nap end Time");
		phoneService.makeCall();
	}
	
	
	
	//Dinner time at 6:00:00 PM
	@Scheduled(cron = "1 1 18 * * *")
	public void dinnerTime() {
		System.out.println("dinner Time");
		phoneService.makeCall();
	}
	
	//evening activities
	//after-dinner activities include watching a movie,
	//playing a game of cards, or taking a warm bath
	@Scheduled(cron = "1 1 19 * * *")
	public void eveningActivities() {
		System.out.println("evening activities");
		phoneService.makeCall();
	}
	
	//bed time
	@Scheduled(cron = "1 1 21 * * *")
	public void BedTime() {
		System.out.println("bed time");
		phoneService.makeCall();
	}
	
	
	
}
