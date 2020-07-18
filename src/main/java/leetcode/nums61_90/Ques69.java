package leetcode.nums61_90;

//考虑到越界问题；改用除法  考虑分母为0的问题！
public class Ques69 {

    public int mySqrt(int x) {
        if (x <= 1) return x;

        int start = 0 ; int end = x ;
        while ( start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(x / mid == mid) {
                return mid;
            } else if ( x / mid > mid) {
                start = mid;
            } else {
                end = mid;
            }

        }
        if ( x / end >= end ) return end;
        return start;
    }
}
