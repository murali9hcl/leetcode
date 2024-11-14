package algo.greedy;

public class Activity {
    private String activity;
    private int startTime;
    private int endTime;



    public Activity(String activity, int startTime, int endTime) {
        this.activity = activity;
        this.startTime = startTime;
        this.endTime = endTime;
    }



    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        return "Activity{" +
                "activity='" + activity + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
