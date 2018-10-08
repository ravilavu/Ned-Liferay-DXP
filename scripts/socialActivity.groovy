import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil

activityCount = SocialActivityLocalServiceUtil.getSocialActivitiesCount()
socialActivity = SocialActivityLocalServiceUtil.getSocialActivities(0,activityCount)
for(activity in socialActivity){
SocialActivityLocalServiceUtil.deleteSocialActivity(activity)
}