/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.Shell;

public class InterviewPermutation {
    public boolean Permutation(Integer[] a, Integer[] b) {
        if (a.length != b.length)
            return false;
        Shell.sort(a);
        Shell.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
