/*
 * 74] Design Skiplist
 */

class Skiplist {

    List<Integer> list;
    public Skiplist() {
        list = new ArrayList<>();
    }

    public boolean search(int target) {
        if (list.size() == 0) return false;
        int idx = Collections.binarySearch(list, target);
        return idx >= 0;
    }

    public void add(int num) {
        if (list.size() == 0) {
            list.add(num);
        } else {
            int idx = Collections.binarySearch(list, num);
            if (idx < 0) idx = -idx - 1;
            list.add(idx, num);
        }
    }

    public boolean erase(int num) {
        int idx = Collections.binarySearch(list, num);
        if (idx < 0) return false;
        list.remove(idx);
        return true;
    }
}
