import java.util.Arrays;

public class practice_problems_04 {
    public static void mergeSortForStringArray(String arr[], int si , int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei - si)/2;

        mergeSortForStringArray(arr,si,mid);
        mergeSortForStringArray(arr,mid+1,ei);

        merge(arr,mid,si,ei);


    }

    public static void merge(String arr[],int mid ,int si , int ei){
        String temp[] = new String[ei - si +1];
        int i = si ;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j<= ei ){
            if(0 >= arr[i].compareToIgnoreCase(arr[j])){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        // for left part leftover 
        while(i<= mid){
            temp[k++] = arr[i++];

        }

        // for right part leftover
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k=0 , i=si ; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String arg[]){
        // String arr[] = { "sun", "earth", "mars", "mercury"};
        // mergeSortForStringArray(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));

        // int array[] = {2,2,1,1,1,2,2};
        // System.out.println("The mejority element in array "+Arrays.toString(array)+" is : "+majorityEle(array,0,array.length-1));

        int array1[] = {2, 4, 1, 3, 5};
        System.out.println(totalCountInversions(array1,0,array1.length-1));

    }

    public static int majorityEle(int arr[], int si , int ei){
        if(si == ei){
            return arr[si];
        }

        int mid = si + (ei - si)/2;

        int leftMajority =  majorityEle(arr,si,mid);
        int rightMejority = majorityEle(arr,mid+1,ei);
        if (leftMajority ==  rightMejority){
            return leftMajority;
    
        }
        else{
            int countLeft = countInRange(arr,si,ei,leftMajority,0);
            // int countRight = countInRange(arr,si,ei,rightMejority,0);
            if(countLeft > (ei - si +1)/2){
                return leftMajority;
            
            }
            else{
                return rightMejority;
            }
        }
        
    }

    public static int countInRange(int arr[], int si , int ei , int Majority,int count){
        if(si>ei){
            return count;
        }
        if(arr[si]==Majority){
            return countInRange(arr,si+1,ei,Majority,count+1);
        }
        else{
            return countInRange(arr,si+1,ei,Majority,count);
        }
        
    }

    public static int totalCountInversions(int arr[],int si , int ei){
        // base case 
        if (si == ei){
            return 0;
            
        }

        int mid = si + (ei - si)/2;

        int leftCount = totalCountInversions(arr,si,mid);
        int rightCount = totalCountInversions(arr,mid+1,ei);

        return leftCount + rightCount + countInversion(arr , mid , si, ei);



    }

    public static int countInversion(int arr[], int mid , int si , int ei){
        int temp[] = new int[ei - si + 1];
        int countInversion = 0;
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i++];
                
            }
            else{
                countInversion += mid - i +1;
                temp[k] = arr[j++];
            }
            k++;
        }

        // for left half leftover
        while(i<= mid){
            temp[k++] = arr[i++];
        }

        // for right half leftover
        while(j<= ei){
            temp[k++] = arr[j++];
        }

        // copy elements for temp to original array
        for (k= 0 , i = si ; k<temp.length;k++,i++){
            arr[i] = temp[k];
            

        }

        return countInversion;


    }
    
}
