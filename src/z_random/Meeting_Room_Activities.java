package z_random;


import java.util.Arrays;

/*
Problem description:
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...]
(s[i] is strictly less than e[i]), determine if a person could attend all meetings.

Example 1:
Input: [[0,30],[5,10],[15,20]]
Output: false

Example 2:
Input: [[7,10],[2,4]]
Output: true
 */
public class Meeting_Room_Activities {
    public static void main(String[] args) {
        Interval[] meetings = new Interval[]{}; //{{7, 10}, {2, 4}};
        boolean result = canAttendMeeting(meetings);
        System.out.println(result);
    }



//    public static class Interval {
//        int start;
//        int end;
//
//        Interval() {
//            start = 0;
//            end = 0;
//        }
//
//        Interval(int s, int e) {
//            this.start = s;
//            this.end = e;
//        }
//    }


























    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }

    public static boolean canAttendMeeting(Interval[] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);
            // 7 - 10. 9 - 12
        //check if the END Time of the 1st meeting is bigger that the START Time of the 2nd meeting:
        for (int i = 0; i < start.length - 1; i++) {
            if (start[i] > end[i + 1]) return true;
        }
        return false;
    }

}
