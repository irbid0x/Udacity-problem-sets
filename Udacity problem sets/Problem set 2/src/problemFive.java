public class problemFive {
    public static void main (String []args){
        double time=18;
        String timeOfDay;
        if(time>=5&&time<12){
            timeOfDay="morning";
        } else if (time>=12&&time<20) {
            timeOfDay="daytime";
        } else {
            timeOfDay="night";
        }
    }
}
