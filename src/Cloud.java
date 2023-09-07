public class Cloud {
    private String cloudsamount;
    private int windspeed;

    public Cloud(String cloudamount, int windspeed) {
        this.cloudsamount = cloudamount;
        this.windspeed = windspeed;
    }
    public String getCloudsamount() {
        return cloudsamount;
    }
    public void setCloudsamount(String cloudsamount) {
        this.cloudsamount = cloudsamount;
    }
    public  int getWindspeed() {
        return windspeed;
    }
    public void setWindspeed(int windspeed) {
        this.windspeed = windspeed;
    }
}
