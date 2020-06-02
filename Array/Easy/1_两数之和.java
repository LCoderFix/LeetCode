class Solution {
        public int[] twoSum(int[] nums, int target) {
            int a[] = new int[2];
            int b[] = new int[nums.length];
            b = Arrays.copyOf(nums, nums.length);
            Arrays.sort(b);
            if (nums.length < 2) return a;
            int low = 0;
            int high = nums.length - 1;
            while (low < high) {
                if (b[low] + b[high] > target) high--;
                else if (b[low] + b[high] < target) low++;
                else  break;
            }
            a[0] = findPosition(b[low], nums);
            a[1] = findPosition(b[high], nums);
            if (a[0] == a[1])
                a[1] = findNextPosition(b[high], nums);
            return a;
        }

        public int findPosition(int a, int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (a == nums[i])
                    return i;

            }
            return -1;
        }

        public int findNextPosition(int a, int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (a == nums[i]) {
                    count++;
                    if (count == 2)
                        return i;
                }
            }
            return -1;
        }
    }