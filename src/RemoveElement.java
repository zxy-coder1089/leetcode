public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size;) {
            if (nums[i] == val) {
                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                size--; // 长度缩短，i 不前进，重新检查新搬来的元素
            } else {
                i++;
            }
        }
        return size;
    }

}
