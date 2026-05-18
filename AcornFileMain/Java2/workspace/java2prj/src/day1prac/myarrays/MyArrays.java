package day1prac.myarrays;



interface MyComparable {
    // 객체 자신과 다른 객체를 비교할 때 사용하는 약속
    int compareTo( Object other); // 기준이 크면 양수, 작으면 음수 같으면 0
}

interface MyComparator {
    // 두 객체를 외부 기준으로 비교할 때 사용하는 약속
    int compare(Object  o1, Object o2);
}


public class MyArrays {

 
    // 배열 안의 객체가 직접 가진 compareTo 기준으로 정렬한다.
    public static   void sort(Object[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // i번째 값을 기준으로 뒤쪽 값들과 비교한다.
            for (int j = i + 1; j < arr.length; j++) {
               
            	
                // 앞의 값이 뒤의 값보다 크면 자리를 바꾼다.
                if ( ((MyComparable)arr[i]).compareTo(arr[j]) > 0) {
                   
                    Object tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    
    // 비교 기준을 외부에서 comparator로 받아서 정렬한다.
    public static   void sort(Object[] arr, MyComparator  comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            // i번째 값과 뒤쪽 값들을 하나씩 비교한다.
            for (int j = i + 1; j < arr.length; j++) {
             
                // comparator가 앞의 값이 더 크다고 판단하면 교환한다.
                if (comparator.compare(arr[i], arr[j]) > 0) {                   
                    Object tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
