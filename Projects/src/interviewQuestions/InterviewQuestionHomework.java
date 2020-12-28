package interviewQuestions;

//public class InterviewQuestionHomework {
//
//	import java.util.Arrays;
//	​
//	public class Question4 {
//		public static void main(String[] args) {
//			
//			//	By using array create a method which returns the following list
//			//  [3, 5+1, 2+7+9, 2+3+5+7] ==> [3, 6, 18, 17]
//			
//			int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
//			System.out.println(Arrays.toString(arr));
//			System.out.println(Arrays.toString(calculate(arr)));
//		}
//		
//		public static int[] calculate( int arr[]) {
//			
//			int resultArr[] = new int [arr.length];
//			int k=0;
//			
//			for (int i = 0; i < arr.length; i++) {
//				for(int j=1; j<=i+1; j++) {
//					if(k>arr.length-1)
//						return resultArr;
//					else 
//						resultArr[i]+= arr[k++];
//				}
//			}
//			
//			return resultArr;
//		}
//	}
//
//	}
//
//}
