class SortColors {
    public void sortColors(int[] arr) {
        int lp = 0;
        int mp = 0;
        int rp = arr.length-1;
        while(mp<=rp){
            if(arr[mp] == 0){
                int ele = arr[lp];
                arr[lp] = arr[mp];
                arr[mp] = ele;
                lp++;
                mp++;
            }
            else if(arr[mp] == 2){
                int ele = arr[rp];
                arr[rp] = arr[mp];
                arr[mp] = ele;
                rp--;
            }
            else{
            mp++;
            }
        }
    }
    
}