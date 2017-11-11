package shun.fang.SE;

import java.util.Scanner;
import org.junit.Test;
public class Algorithm {
	public static void main(String[] args) {
	}

	
	/***
	 * * 冒泡排序法 具体思路:从数组的第一个元素`arr[0]`开始，
	 * 两两比较**(`arr[n],arr[n+1]`)，如果前面的数大于后面的数（`arr[n] > arr[n+1]`）,那么交换两个元素的位置，
	 * 把大的数往后移动。这样依次经过一轮比较以后， 最大的数将会被交换到最后的位置（arr[n-1]）。
	 * 
	 * @param nums
	 * @return
	 */
	public int[] BubbleSort(int[] nums) {
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
		return nums;
	}

	/**
	 * 选择排序法 具体思路:通**过比较，选择出每一轮中最值元素，然后把他和这一轮中最最前面的元素交换**，
	 * 所以这个算法关键是要记录每次比较的结果，即每次比较后最值位置 （下标）。
	 * 
	 * @param nums
	 * @return
	 */
	public int[] SelectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	/*
	 * java 请写一个冒泡排序程序,要求输入10个整数,输出升序排序的结果
	 */

	public void BubbleSortApp1() {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数");
			nums[i] = scanner.nextInt();
		}
		nums = this.BubbleSort(nums);// 该方法在已写在算法部分

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "--");
		}
	}

	/**
	 * 快速排序法
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 */
	static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right;
		int piovt = arr[left];// 基准数:数组的第一个数作为基准数,用于存放一开始
		while (i != j) {
			// 循环1：从数组右边开始循环，直到找到小于基准数的元素并且放在数组的右边。
			while (i < j && arr[j] >= piovt) {
				j--;
			}
			arr[i] = arr[j];
			// 循环2：从数组左边开始循环，直到找到大于基准数的元素并且放在数组的左边。
			while (i < j && arr[i] <= piovt) {
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = piovt;
		quickSort(arr, left, i - 1);
		quickSort(arr, i + 1, right);

	}
	

	/***
	 * 经典算法题——猴子吃桃
	 * 一个猴子摘了一堆桃子，第一天吃了桃子的一半后又吃了一个，第二天也吃了剩下的桃子的一半后又吃了一个，以此吃下去，到了第十天还剩下一个桃子
	 * ，问当初猴子总摘了多少个桃子？
	 */
	@Test
	public  void monkeyEatPeach() {
		int sum = 0, remain = 1;
		// 每天吃剩的桃子加一个正好是前一天桃子的一半，每天桃子的总数就是前一天剩下桃子的数量
		for (int day = 9; day >= 1; day--) {
			sum = (remain + 1) * 2;
			remain = sum;
			System.out.println("第" + day + "天还剩" + remain + "个桃子");
		}
		System.out.println(sum);

	}

}
