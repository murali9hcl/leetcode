package algo.greedy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public static void activitySelection(List<Activity> activityList) {
        Collections.sort(activityList, Comparator.comparingInt(Activity::getEndTime));
        Activity previousActivity = activityList.get(0);
        System.out.println("Recomended Activity" + previousActivity);

        for (int i = 1; i < activityList.size(); i++) {
            Activity activity = activityList.get(i);
            if(activity.getStartTime() >= previousActivity.getEndTime()) {
                System.out.println(activity);
                previousActivity = activity;

            }
        }
    }
}
