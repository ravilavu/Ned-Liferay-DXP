import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil

  activityCount=SocialActivityLocalServiceUtil.getSocialActivitiesCount()
  noOfExecutions = activityCount.intdiv(500)
  remainingActivity = activityCount%500
  if(remainingActivity>0){
   noOfExecutions++
  }

   for(i=1;i<= noOfExecutions;i++){
    socialActivity = SocialActivityLocalServiceUtil.getSocialActivities(0,500)
    for(activity in socialActivity){
     SocialActivityLocalServiceUtil.deleteSocialActivity(activity)
    } 
  }