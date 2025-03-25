public class Weeks {
    public static void describeWeek() {
        System.out.println("A week consists of seven days, starting from Sunday to Saturday.");
    }

    public static void describeWeek(String weekType) {
        System.out.println("This week is a " + weekType + " week.");
    }

    public static void describeWeek(String weekType, int numberOfDays) {
        System.out.println("This " + weekType + " week has " + numberOfDays + " days.");
    }

    public static void describeWeek(String weekType, String notableEvent) {
        System.out.println("This " + weekType + " week features " + notableEvent + ".");
    }

    public static void describeWeek(String weekType, String vibe, String activity) {
        System.out.println("This " + weekType + " week feels " + vibe + " and is great for " + activity + ".");
    }

    public static void describeWeek(int weekNumber, String task) {
        System.out.println("Week " + weekNumber + " is dedicated to " + task + ".");
    }

    public static void describeWeek(String[] daysOfWeek) {
        System.out.println("Here are the days of the week: ");
        for (String day : daysOfWeek) {
            System.out.println("- " + day);
        }
    }

    public static void describeWeek(String weekType, boolean isHolidayWeek) {
        System.out.println("This " + weekType + " week is " + (isHolidayWeek ? "a holiday week!" : "not a holiday week."));
    }

    public static void describeWeek(int weekNumber, String vibe, int daysCompleted) {
        System.out.println("Week " + weekNumber + " has a " + vibe + " vibe, and " + daysCompleted + " days have been completed.");
    }

    public static void describeWeek(String weekType, int numberOfTasks, String priorityTask) {
        System.out.println("This " + weekType + " week has " + numberOfTasks + " tasks. The priority task is " + priorityTask + ".");
    }

    public static void describeWeek(int startDay, int endDay) {
        System.out.println("This week starts on day " + startDay + " and ends on day " + endDay + ".");
    }

    public static void describeWeek(int weekNumber, String weekGoal, boolean isAchieved) {
        System.out.println("Week " + weekNumber + " focuses on " + weekGoal + " and it was " + (isAchieved ? "achieved!" : "not achieved."));
    }

    public static void describeWeek(String vibe, String event, int daysRemaining) {
        System.out.println("This week feels " + vibe + " with " + event + " coming up. There are " + daysRemaining + " days left.");
    }

    public static void describeWeek(String weekName, String activity) {
        System.out.println(weekName + " is perfect for " + activity + ".");
    }

    public static void describeWeek(String weekType, String weatherCondition) {
        System.out.println("This " + weekType + " week has " + weatherCondition + " weather.");
    }

    public static void describeWeek(String weekName, double workloadHours) {
        System.out.println(weekName + " involves " + workloadHours + " hours of work.");
    }

    public static void describeWeek(char weekInitial, String highlight) {
        System.out.println("The week starting with " + weekInitial + " is highlighted by " + highlight + ".");
    }

    public static void describeWeek(String weekType, String healthTip, int exerciseHours) {
        System.out.println("This " + weekType + " week focuses on " + healthTip + " with " + exerciseHours + " hours of exercise.");
    }

    public static void describeWeek(int weekNumber, String celebration, String location) {
        System.out.println("Week " + weekNumber + " is celebrated with " + celebration + " in " + location + ".");
    }

    public static void main(String[] args) {
        describeWeek();
        describeWeek("work");
        describeWeek("holiday", 7);
        describeWeek("busy", "team meetings");
        describeWeek("productive", "focused", "learning Java");
        describeWeek(1, "coding practice");
        describeWeek(new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"});
        describeWeek("vacation", true);
        describeWeek(2, "relaxed", 3);
        describeWeek("goal-oriented", 5, "presentation preparation");
        describeWeek(1, 7);
        describeWeek(3, "project submission", false);
        describeWeek("calm", "mid-year evaluation", 2);
        describeWeek("fun week", "hiking");
        describeWeek("chilly week", "cold and foggy");
        describeWeek("work week", 40.0);
        describeWeek('F', "Friday celebrations");
        describeWeek("fitness", "yoga and stretching", 6);
        describeWeek(4, "festivals", "New Delhi");
    }
}
