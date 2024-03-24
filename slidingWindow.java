public class SlidingWindow {

    public static void main(String[] args) {
      // Sample data (replace with your actual data)
      int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
      int windowSize = 3;
  
      // Function to perform your desired operation on the window
      findMaxSum(arr, windowSize);
    }
  
    // Replace this function with your specific logic
    public static void findMaxSum(int[] arr, int windowSize) {
      int n = arr.length;
  
      // Check for invalid input
      if (n < windowSize) {
        System.out.println("Invalid window size");
        return;
      }
  
      // Initialize variables
      int currentSum = 0;
      int maxSum = Integer.MIN_VALUE;
  
      // Calculate sum of the first window
      for (int i = 0; i < windowSize; i++) {
        currentSum += arr[i];
      }
  
      // Slide the window
      for (int i = windowSize; i < n; i++) {
        // Update current sum by removing the first element and adding the last element
        currentSum = currentSum - arr[i - windowSize] + arr[i];
  
        // Update maxSum if necessary
        maxSum = Math.max(maxSum, currentSum);
      }
  
      System.out.println("Maximum sum for window size " + windowSize + ": " + maxSum);
    }
  }
  
