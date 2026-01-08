public class MyGList<T> {
    private T[] nums;

    public MyGList() {
        nums = null;
    }

    public MyGList(int size) {
        this.nums = (T[]) new Object[size];
    }

    public int size() {
        return this.nums.length;
    }

    public void update(int ind, T data) {
        nums[ind] = data;
    }

    @Override
    public String toString() {
        String str = "";
        for (T n : nums) {
            if (n instanceof Object) {
                str += (n.toString() + ", ");
            }
        }
        return str;
    }

    public static void main(String[] args) {
        MyGList<Integer> vals = new MyGList<Integer>(3);
        System.out.println(vals);
        vals.update(2, 7);
        vals.update(0, 4);
        vals.update(1, 3);
        System.out.println(vals);
    }
}
