/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Areeba PC
 */
public enum static List<Integer> max5(List<Integer> lst) {
    if (lst.size() <= 5)
        return lst;

    int a = lst.remove(lst.size() - 1);
    List<Integer> b = max5(lst);

    for (int i = 0; i < b.size(); i++) {
        int t = b.get(i);
        if (a > t) {
            lst.set(i, a);
            a = t;
        }
    }

    return b;
}
 